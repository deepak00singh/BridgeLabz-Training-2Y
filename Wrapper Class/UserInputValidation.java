public class UserInputValidation {
    public static boolean isValidAge(String age) {
        try {
            int a = Integer.parseInt(age);
            return a >= 18;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidAge("20"));
        System.out.println(isValidAge("abc"));
        System.out.println(isValidAge("17"));
    }
}
