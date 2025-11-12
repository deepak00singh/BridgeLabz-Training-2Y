interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Paytm paytm = new Paytm();
        paytm.processPayment(500);
        paytm.refund(200);
    }
}
