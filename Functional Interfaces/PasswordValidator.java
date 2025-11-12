interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String pwd = "Java2025";
        System.out.println("Strong Password? " + SecurityUtils.isStrongPassword(pwd));
    }
}
