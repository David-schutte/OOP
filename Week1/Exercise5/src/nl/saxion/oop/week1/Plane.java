package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Plane {
    boolean passengersentered;
    boolean luggageloaded;
    boolean lockeddoors;

    public void loadPassengers() {
        if (!lockeddoors) {
            passengersentered = true;
            SaxionApp.printLine("Successfully entered the plane");
    } else {
            SaxionApp.printLine("Can't enter, doors are locked!");
        }
    }

    public void loadLuggage() {
        if (!lockeddoors) {
            luggageloaded = true;
            SaxionApp.printLine("Successfully loaded luggage into the plane");
        } else {
            SaxionApp.printLine("Can't enter, doors are locked!");
        }
    }


    public void lockDoors() {
        lockeddoors = !lockeddoors;
        SaxionApp.printLine("Are the doors locked? " + lockeddoors);
    }

    public boolean readyForDeparture() {
        return passengersentered && luggageloaded && lockeddoors;
    }

    public void depart() {
        if (readyForDeparture()) {
            SaxionApp.printLine("Departing!");
        } else {
            SaxionApp.printLine("Please do all options above first!");
        }
    }
}
