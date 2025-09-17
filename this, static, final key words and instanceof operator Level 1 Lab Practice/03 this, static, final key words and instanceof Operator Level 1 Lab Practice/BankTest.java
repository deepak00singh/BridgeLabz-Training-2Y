class BankAccount {
    private static String bankName = "State Bank of India"; // Static shared value
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber; // Final: cannot change after initialization

    // Constructor using this
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display details with instanceof
    public void displayDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Bank: " + bankName + 
                               ", Holder: " + acc.accountHolderName + 
                               ", Account No: " + acc.accountNumber);
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aman", 101);
        BankAccount acc2 = new BankAccount("Ravi", 102);

        acc1.displayDetails(acc1);
        acc2.displayDetails(acc2);

        BankAccount.getTotalAccounts();
    }
}
