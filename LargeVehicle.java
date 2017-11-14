package com.vehicle;

public abstract class LargeVehicle extends Vehicle
{
    
    public LargeVehicle(String model, Make make, int year)
    {
        super(model, make, year);
        this.price = getPrice();
    }

    private double price; 
    
    @Override
    public double getPrice()
    {
        MsrpImpl msrpImp = new MsrpImpl();
        this.price = msrpImp.getLargeMsrp(this.getYear(), this.getMake());
        return this.price;
        
    }

    

}
