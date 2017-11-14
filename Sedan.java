package com.vehicle;

public class Sedan extends SmallVehicle
{
    
   

    public Sedan(Make make, String model, int year)
    {
        super(model, make, year);
    }

    
    @Override
    public String toString()
    {
        return "Sedan [getPrice()="
            + getPrice()  + ", getModel()=" + getModel() + ", getMake()=" + getMake() + ", getYear()=" + getYear() + "]";
    }
}
