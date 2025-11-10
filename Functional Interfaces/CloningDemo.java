class Prototype implements Cloneable {
    int value = 10;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype();
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Original value: " + p1.value);
        System.out.println("Cloned value: " + p2.value);
    }
}
