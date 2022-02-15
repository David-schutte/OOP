package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Circle {
    int xCoord;
    int yCoord;
    int radius;


    public Circle(int xCoord, int yCoord, int radius) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.radius = radius;
    }

    public int getxCoordinate() {
        return xCoord;
    }

    public int getyCoordinate() {
        return yCoord;
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return (Math.sqrt(radius) * Math.PI);
    }

    public double perimeter() {
        return (2 * radius * Math.PI);
    }

    public void draw() {
        SaxionApp.setBorderSize(0);
        SaxionApp.drawCircle(getxCoordinate(), getyCoordinate(), getRadius());
    }
}
