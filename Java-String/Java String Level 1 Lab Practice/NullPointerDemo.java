public class NullPointerDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a method on a null object reference.");
        }
    }
}
