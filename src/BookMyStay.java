public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("Book My Stay - Hotel Booking System");
        System.out.println("Room Initialization Module - Version 2.1");
        System.out.println("============================================");


        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleRoomAvailability = 5;
        int doubleRoomAvailability = 3;
        int suiteRoomAvailability = 2;

        System.out.println("\n--- Single Room Details ---");
        singleRoom.displayRoomDetails();
        System.out.println("Available Units : " + singleRoomAvailability);

        System.out.println("\n--- Double Room Details ---");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Units : " + doubleRoomAvailability);

        System.out.println("\n--- Suite Room Details ---");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Units : " + suiteRoomAvailability);

        System.out.println("\nApplication terminated successfully.");
    }
}

abstract class Room {

    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Number of Beds : " + numberOfBeds);
        System.out.println("Room Size (sq ft) : " + squareFeet);
        System.out.println("Price Per Night : ₹" + pricePerNight);
    }
}


class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}


class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}