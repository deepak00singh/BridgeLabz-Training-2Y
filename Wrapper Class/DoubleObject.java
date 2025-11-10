public class DoubleObject {
    public static void main(String[] args) {
        Double d = 45.67;

        double primitiveDouble = d;
        int primitiveInt = (int) d.doubleValue();

        System.out.println("Double object: " + d);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive int (cast): " + primitiveInt);
    }
}
