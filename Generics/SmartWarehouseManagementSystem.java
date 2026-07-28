import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private final String name;
    public WarehouseItem(String name){ this.name = name; }
    public String getName(){ return name; }
    public String toString(){ return this.getClass().getSimpleName() + ": " + name; }
}

class Electronics extends WarehouseItem { public Electronics(String n){ super(n); } }
class Groceries extends WarehouseItem { public Groceries(String n){ super(n); } }
class Furniture extends WarehouseItem { public Furniture(String n){ super(n); } }

class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
    public T get(int i) { return items.get(i); }
    public List<T> getAll() { return items; }
}

public class SmartWarehouseManagementSystem {
    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem w : list) System.out.println(w);
    }

    public static void main(String[] args) {
        Storage<Electronics> eleStorage = new Storage<>();
        eleStorage.add(new Electronics("TV"));
        eleStorage.add(new Electronics("Radio"));

        Storage<Furniture> furnStorage = new Storage<>();
        furnStorage.add(new Furniture("Table"));

        System.out.println("Electronics in storage:");
        displayAll(eleStorage.getAll());

        System.out.println("Furniture in storage:");
        displayAll(furnStorage.getAll());
    }
}
