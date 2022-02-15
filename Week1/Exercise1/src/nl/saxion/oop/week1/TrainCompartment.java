package nl.saxion.oop.week1;

public class TrainCompartment {
    private final int numberOfSeats;
    private final int compartmentClass;
    private int numberOfSeatsInUse;

    public TrainCompartment(int numberOfSeats, int compartmentClass, int numberOfSeatsInUse) {
        this.numberOfSeats = numberOfSeats;
        this.compartmentClass = compartmentClass;
        this.numberOfSeatsInUse = numberOfSeatsInUse;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCompartmentClass() {
        return compartmentClass;
    }

    public int getNumberOfSeatsInUse() {
        return numberOfSeatsInUse;
    }

    public void enter() {
        if (numberOfSeatsInUse<5) {
            numberOfSeatsInUse += 1;
        }
    }

    public void leave() {
        if (numberOfSeatsInUse>0) {
            numberOfSeatsInUse -= 1;
        }
    }
}
