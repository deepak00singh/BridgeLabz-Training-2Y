public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) result.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) result.append(Character.toUpperCase(c));
            else result.append(c);
        }
        System.out.println("Toggled: " + result);
    }
}