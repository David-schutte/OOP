package nl.saxion.oop.week1;

import java.awt.Color;
import nl.saxion.app.SaxionApp;

public class Car {
    private final String brand;
    private final String license;
    private final int tanktotal;
    private int tankcurrent;


    public void setTankcurrent(int tankcurrent) {
        this.tankcurrent = tankcurrent;
    }

    private final int consumption;


    public int getTankcurrent() {
        return tankcurrent;
    }

    public Car(String brand, String licence, int tanktotal, int tankcurrent, int consumption) {
        this.brand = brand;
        this.license = licence;
        this.tanktotal = tanktotal;
        this.tankcurrent = tankcurrent;
        this.consumption = consumption;
    }

    public void getStats() {
        SaxionApp.printLine("Your " + brand + " with license plate "
            + license + " has a total tank of "
            + tanktotal + ".");
        SaxionApp.printLine("There is currently "
            + tankcurrent + " litres in there.");
        SaxionApp.printLine("Your consumption is "
            + consumption + "km per 1 litre");
    }


    private double kmLeft() {
        return (getTankcurrent() * consumption);
    }

    public void drive(int km) {
        int litersused = km / consumption;
        if (km > kmLeft()) {
            SaxionApp.printLine("Sorry, but you don't have enough fuel left!", Color.red);
        } else {
            setTankcurrent(getTankcurrent() - litersused);
            SaxionApp.printLine("Done! You currently have " + getTankcurrent() + " liters left in your tank.");
        }
    }

    public void addFuel(int fuel) {
        if (getTankcurrent() + fuel <= tanktotal) {
            setTankcurrent(getTankcurrent() + fuel);
        } else {
            SaxionApp.printLine("You cannot overfill your tank!", Color.red);
        }
    }
}
