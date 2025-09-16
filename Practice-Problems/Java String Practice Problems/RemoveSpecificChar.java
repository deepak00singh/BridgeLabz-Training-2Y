public class RemoveSpecificChar {
    public static void main(String[] args) {
        String str = "Hello World";
        char remove = 'l';
        String result = str.replaceAll(String.valueOf(remove), "");
        System.out.println("Modified String: " + result);
    }
}