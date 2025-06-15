// Transport.java
interface Transport {
    void bookTicket();
}

// Bus.java
class Bus implements Transport {
    public void bookTicket() {
        System.out.println("Bus ticket booked.");
    }
}

// Train.java
class Train implements Transport {
    public void bookTicket() {
        System.out.println("Train ticket booked.");
    }
}

// Flight.java
class Flight implements Transport {
    public void bookTicket() {
        System.out.println("Flight ticket booked.");
    }
}

// Main.java
public class Main {
    // Method that uses Transport interface reference
    public static void processBooking(Transport t) {
        t.bookTicket();
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        Transport train = new Train();
        Transport flight = new Flight();

        processBooking(bus);
        processBooking(train);
        processBooking(flight);
    }
}