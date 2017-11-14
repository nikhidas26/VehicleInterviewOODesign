package com.vehicle;

public class VehicleFactory
{
    
    public Vehicle getVehicle(String vehicleType, Make make, String model, int year) {
        if(vehicleType == null) {
            return null;
        } else if(vehicleType == "Sedan") {
            return new Sedan(make, model, year);
        } else if(vehicleType == "Truck") {
            return new Truck(make, model, year);
        } else if(vehicleType == "Van") {
            return new Van(make, model, year);
        }
        return null;
    }

}
