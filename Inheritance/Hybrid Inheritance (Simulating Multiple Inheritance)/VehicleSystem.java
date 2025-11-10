// Vehicle Management System - Hybrid Inheritance Example
interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging electric vehicle with " + batteryCapacity + " kWh battery.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; // in liters

    PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle with " + fuelTankCapacity + " liters of fuel.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "BMW M3", 60);

        ev.displayInfo();
        ev.charge();
        System.out.println("--------------------");
        pv.displayInfo();
        pv.refuel();
    }
}
