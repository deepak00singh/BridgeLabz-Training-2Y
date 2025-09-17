class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String seat, double newPrice) {
        seatNumber = seat;
        price = newPrice;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Avatar", "A1", 12.5);
        t.displayTicket();
        t.bookTicket("B2", 15.0);
        t.displayTicket();
    }
}