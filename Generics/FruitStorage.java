class Fruit { public String toString(){ return "Fruit"; } }
class Apple extends Fruit { public String toString(){ return "Apple"; } }
class Mango extends Fruit { public String toString(){ return "Mango"; } }
class Car { } // non-fruit

class FruitBox<T extends Fruit> {
    private final java.util.List<T> items = new java.util.ArrayList<>();
    public void add(T item) { items.add(item); }
    public void display() {
        for (T t : items) System.out.println(t);
    }
}

public class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.display();

        FruitBox<Mango> mangos = new FruitBox<>();
        mangos.add(new Mango());
        mangos.display();

        // FruitBox<Car> carBox = new FruitBox<>(); // compile-time error - Car is not a Fruit
    }
}
