package com.vehicle;

public abstract class SmallVehicle extends Vehicle
{
    
    public SmallVehicle(String model, Make make, int year)
    {
        super(model, make, year);
        this.price = getPrice();
    }
    
    private double price; 

    @Override
    public double getPrice()
    {
        MsrpImpl msrpImp = new MsrpImpl();
        this.price = msrpImp.getSmallMsrp(this.getYear(), this.getMake());
        return this.price;
        
    }
    

}
