class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItem() {
        System.out.println("Code: " + itemCode + ", Name: " + itemName + ", Price: " + price);
    }

    public double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item i = new Item(101, "Pen", 2.5);
        i.displayItem();
        System.out.println("Total cost for 10: " + i.totalCost(10));
    }
}