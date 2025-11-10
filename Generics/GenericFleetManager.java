import java.util.ArrayList;
import java.util.List;

class Vehicle { private final String name; public Vehicle(String name){ this.name = name; } public String toString(){ return name; } }
class Truck extends Vehicle { public Truck(String name){ super(name); } }
class Bike extends Vehicle { public Bike(String name){ super(name); } }

class FleetManager<T extends Vehicle> {
    private final List<T> fleet = new ArrayList<>();
    public void addVehicle(T vehicle) { fleet.add(vehicle); }
    public void showFleet() { fleet.forEach(System.out::println); }
}

public class GenericFleetManager {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Truck A"));
        truckFleet.addVehicle(new Truck("Truck B"));
        System.out.println("Truck fleet:");
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Bike X"));
        System.out.println("Bike fleet:");
        bikeFleet.showFleet();
    }
}
