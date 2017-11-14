package com.vehicle;

public class Truck extends LargeVehicle
{
    
    public Truck(Make make, String model, int year)
    {
        super(model, make, year);
    }
    
    public void truckTowMethod() {
        System.out.println("Truck tow method");
    }

    
    @Override
    public String toString()
    {
        return "Truck [getPrice()="
            + getPrice()  + ", getModel()=" + getModel() + ", getMake()=" + getMake() + ", getYear()=" + getYear() + "]";
    }
}
