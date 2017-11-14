package com.vehicle;

public class VehicleTest
{

    public static void main(String[] args)
    {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Sedan sedan = (Sedan) vehicleFactory.getVehicle("Sedan", Make.TOYOTA, "Solara", 2007);
        System.out.println(sedan.toString());
        
        Truck truck = (Truck) vehicleFactory.getVehicle("Truck", Make.FORD, "Escape", 2010);
        System.out.println(truck.toString());
        truck.truckTowMethod();
        
        Van van = (Van) vehicleFactory.getVehicle("Van", Make.HONDA, "Odyssey", 2010);
        System.out.println(van.toString());
        van.vanCapacityMethod();
        
    }

}
