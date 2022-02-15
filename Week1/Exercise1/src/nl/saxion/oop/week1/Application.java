package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        TrainCompartment train = new TrainCompartment(5, 2, 0);
        int menuInput;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show compartment details ");
            SaxionApp.printLine("* 2) Passenger enters");
            SaxionApp.printLine("* 3) Passenger leaves");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                SaxionApp.printLine(
                    "The are currently " + train.getNumberOfSeatsInUse() + " seats in use out of a total of " +
                        train.getNumberOfSeats() + " on the train compartment with class " +
                        train.getCompartmentClass() + ".");
                SaxionApp.pause();
            } else if (menuInput == 2) {
                SaxionApp.printLine("Passenger is trying to enter the train...");
                train.enter();
                SaxionApp.printLine("There are now " + train.getNumberOfSeatsInUse() + " seats in use.");
                SaxionApp.pause();
            } else if (menuInput == 3) {
                SaxionApp.printLine("A passenger leaves the train...");
                train.leave();
                SaxionApp.printLine("There are now " + train.getNumberOfSeatsInUse() + " seats in use.");
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }
        }
        while (menuInput != 0);

    }
}