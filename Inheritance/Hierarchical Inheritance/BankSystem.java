// Bank Account Hierarchical Inheritance Example
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account with interest rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account with withdrawal limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTerm; // in months

    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account with term: " + depositTerm + " months");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA202", 30000, 20000);
        FixedDepositAccount fda = new FixedDepositAccount("FD303", 100000, 12);

        sa.displayDetails();
        sa.displayAccountType();
        System.out.println("--------------------");

        ca.displayDetails();
        ca.displayAccountType();
        System.out.println("--------------------");

        fda.displayDetails();
        fda.displayAccountType();
    }
}
