class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Area: " + calculateArea() + ", Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
    }
}