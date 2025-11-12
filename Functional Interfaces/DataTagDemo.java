interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username = "Admin";
    String password = "12345";
}

public class DataTagDemo {
    public static void main(String[] args) {
        UserCredentials u = new UserCredentials();
        if (u instanceof SensitiveData)
            System.out.println("This data must be encrypted before storage!");
    }
}
