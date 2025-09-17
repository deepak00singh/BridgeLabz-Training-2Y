class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    private double calculateCost() {
        return rentalDays * 50.0;
    }

    public void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days. Total: $" + totalCost);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Alice", "Toyota", 5);
        c.display();
    }
}