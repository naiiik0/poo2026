package ejMinibuses;

public class Minibus {
    private String licensePlate;
    private int seatsNumber;
    private int occupiedSeatsNumber;
    private State state;
    private static int ticketValue = 500;

    public Minibus(String licensePlate, int seatsNumber) {
        this.licensePlate = licensePlate;
        this.seatsNumber = seatsNumber;
        state = State.IN_SERVICE;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getOccupiedSeatsNumber() {
        return occupiedSeatsNumber;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static int getTicketValue() {
        return ticketValue;
    }

    public static void setTicketValue(int ticketValue) {
        Minibus.ticketValue = ticketValue;
    }

    public boolean takeSeats(int seats) {
        int disponibles = seatsNumber - occupiedSeatsNumber;
        if(state == State.IN_SERVICE && seats <= disponibles) {
            occupiedSeatsNumber += seats;
            return true;
        }
        return false;
    }
    public boolean releaseSeats(int seats) {
        if (state == State.IN_SERVICE &&  seats <= occupiedSeatsNumber) {
            occupiedSeatsNumber -= seats;
            return true;
        }
        return false;
    }
}
