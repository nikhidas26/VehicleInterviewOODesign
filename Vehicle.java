package com.vehicle;

public abstract class Vehicle
{
    private long id;
    
    private String model;
    
    private Make make;
    
    private int year;
    
    public Vehicle(String model, Make make, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

   
    
    public long getId()
    {
        return id;
    }



    public void setId(long id)
    {
        this.id = id;
    }



    public String getModel()
    {
        return model;
    }



    public void setModel(String model)
    {
        this.model = model;
    }



    public Make getMake()
    {
        return make;
    }



    public void setMake(Make make)
    {
        this.make = make;
    }



    public int getYear()
    {
        return year;
    }



    public void setYear(int year)
    {
        this.year = year;
    }



    public abstract double getPrice();
    
}
