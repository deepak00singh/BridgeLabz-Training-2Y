import java.util.List;

class Product {
    private final double price;
    public Product(double price){ this.price = price; }
    public double getPrice(){ return price; }
}
class Mobile extends Product { public Mobile(double p){ super(p); } }
class Laptop extends Product { public Laptop(double p){ super(p); } }

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = java.util.Arrays.asList(new Mobile(199.99), new Mobile(299.99));
        List<Laptop> laptops = java.util.Arrays.asList(new Laptop(999.99), new Laptop(1299.99));

        System.out.println("Total mobiles: " + calculateTotal(mobiles));
        System.out.println("Total laptops: " + calculateTotal(laptops));
    }
}
