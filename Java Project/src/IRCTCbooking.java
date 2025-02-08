class Train{
    private int trainNumber;
    private String starting;
    private String destination;

    public Train(int trainNumber, String starting, String destination){
        this.trainNumber = trainNumber;
        this.starting = starting;
        this.destination = destination;
    }


}

class Passenger{
    private String name;
    private int age;
    private String gender;
}

class Ticket{
    private long PNR;
    private int seatNumber;
    private int cost;
    private int trainNumber;
    private String coachType;
}

class Coach{
    private String coachType;
    private int totalSeats;
    private int availableSeats;
    public boolean bookSeats(int passengers) {
        if (availableSeats >= passengers) {
            availableSeats -= passengers;
            return true;
        }
        return false;
    }
}
public class IRCTCbooking {
    public static void main(String[] args) {

    }
}
