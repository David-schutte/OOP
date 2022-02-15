package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.printLine("Give a xCoord");
        int xCoord = SaxionApp.readInt();
        SaxionApp.printLine("Give a yCoord");
        int yCoord = SaxionApp.readInt();
        SaxionApp.printLine("Give a radius");
        int radius = SaxionApp.readInt();
        Circle c = new Circle(xCoord, yCoord, radius);
        SaxionApp.clear();

        // We used the following lines of code to produce the sample_output.png file.
        SaxionApp.printLine("x: " + c.getxCoordinate() + ", y: " + c.getyCoordinate() + ", radius: " + c.getRadius());
        SaxionApp.printLine("area: " + c.area() + ", perimeter: " + c.perimeter());
        c.draw();

    }
}