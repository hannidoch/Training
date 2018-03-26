public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Flight flight = new Flight();
        flight.setSeats(150);
        int numSeats = flight.getSeats();
        System.out.println("Number of Seats are " + numSeats);




    }
}
