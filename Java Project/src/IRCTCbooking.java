class Train{
    private int trainNumber;
    private String starting;
    private String destination;
    private String[] coachType = new String[5];

    public Train(int trainNumber, String starting, String destination, String[] coachType){
        this.trainNumber = trainNumber;
        this.starting = starting;
        this.destination = destination;
        this.coachType = coachType;
    }


}

class Passenger{
    private String name;
    private int age;
    private String gender;

    public Passenger(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Ticket{
    private long PNR;
    private int seatNumber;
    private int cost;
    private int trainNumber;

    public Ticket(Long PNR, int seatNumber, int cost, int trainNumber){
        this.PNR = PNR;
        this.seatNumber = seatNumber;
        this.cost = cost;
        this.trainNumber = trainNumber;
    }
}

class Coach{
    private String[] coach = new String[5];
    private int totalSeats;
    private int availableSeats;

    public Coach(String[] coach, int totalSeats, int availableSeats){
        this.coach = coach;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }
}
public class IRCTCbooking {
    public static void main(String[] args) {
    }
}
