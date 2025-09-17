class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int q) {
        quantity += q;
    }

    public void removeItem(int q) {
        if (q <= quantity) quantity -= q;
    }

    public void displayTotalCost() {
        System.out.println("Total cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Book", 10.0, 2);
        c.displayTotalCost();
        c.addItem(3);
        c.displayTotalCost();
        c.removeItem(2);
        c.displayTotalCost();
    }
}