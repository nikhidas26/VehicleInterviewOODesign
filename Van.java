package com.vehicle;

public class Van extends LargeVehicle
{
    public Van(Make make, String model, int year)
    {
        super(model, make, year);
    }
    
    public void vanCapacityMethod() {
        System.out.println("Van Capacity Method");
    }

    @Override
    public String toString()
    {
        return "Van [getPrice()="
            + getPrice()  + ", getModel()=" + getModel() + ", getMake()=" + getMake() + ", getYear()=" + getYear() + "]";
    }
}
