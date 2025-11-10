// Restaurant Management System - Hybrid Inheritance Example
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking " + specialty + " dishes.");
    }
}

class Waiter extends Person implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving " + tableCount + " tables.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian");
        Waiter waiter = new Waiter("John", 201, 5);

        chef.displayInfo();
        chef.performDuties();
        System.out.println("--------------------");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
