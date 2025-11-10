import java.util.ArrayList;
import java.util.List;

interface Category { String getCategoryName(); }

enum BookCategory implements Category { FICTION, NONFICTION; public String getCategoryName(){ return name(); } }
enum ClothingCategory implements Category { MEN, WOMEN; public String getCategoryName(){ return name(); } }

class Product<T extends Category> {
    private final String name;
    private double price;
    private final T category;

    public Product(String name, double price, T category) {
        this.name = name; this.price = price; this.category = category;
    }
    public double getPrice() { return price; }
    public void setPrice(double p) { price = p; }
    public String toString(){ return name + " (" + category.getCategoryName() + "): " + price; }
}

public class DynamicOnlineMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100.0);
        product.setPrice(newPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Guide", 500.0, BookCategory.FICTION);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 799.0, ClothingCategory.MEN);

        System.out.println("Before: " + book);
        applyDiscount(book, 10); // 10% off
        System.out.println("After discount: " + book);

        System.out.println("Before: " + shirt);
        applyDiscount(shirt, 20);
        System.out.println("After discount: " + shirt);

        // You can keep a catalog with mixed product types:
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        System.out.println("Catalog: " + catalog);
    }
}
