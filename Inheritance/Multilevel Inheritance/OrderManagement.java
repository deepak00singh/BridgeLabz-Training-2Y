// Online Retail Order Management Example
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped, Tracking No: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order(101, "2025-09-20");
        ShippedOrder o2 = new ShippedOrder(102, "2025-09-21", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder(103, "2025-09-22", "TRK67890", "2025-09-24");

        System.out.println("Order 1: " + o1.getOrderStatus());
        System.out.println("Order 2: " + o2.getOrderStatus());
        System.out.println("Order 3: " + o3.getOrderStatus());
    }
}
