import java.util.ArrayList;
import java.util.List;

class Electronics { 
    private final String name;
    public Electronics(String name){ this.name = name; }
    public String toString(){ return "Electronics: " + name; }
}
class Clothing {
    private final String name;
    public Clothing(String name){ this.name = name; }
    public String toString(){ return "Clothing: " + name; }
}

class Cart<T> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { items.forEach(System.out::println); }
}

public class GenericCart {
    public static void main(String[] args) {
        Cart<Electronics> elecCart = new Cart<>();
        elecCart.addItem(new Electronics("Phone"));
        elecCart.addItem(new Electronics("Headphones"));
        System.out.println("Electronics cart:");
        elecCart.displayItems();

        Cart<Clothing> clothCart = new Cart<>();
        clothCart.addItem(new Clothing("T-Shirt"));
        clothCart.addItem(new Clothing("Jeans"));
        System.out.println("Clothing cart:");
        clothCart.displayItems();
    }
}
