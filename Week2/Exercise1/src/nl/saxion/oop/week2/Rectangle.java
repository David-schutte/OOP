package nl.saxion.oop.week2;

import java.awt.Color;
import java.awt.Point;
import nl.saxion.app.SaxionApp;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    public static final int X = 0;
    public static final int Y = 0;
    public static final int WIDTH = 100;
    public static final int HEIGHT = 100;
    public static final Color COLOR = Color.red;

    public Rectangle() {
        this(X, Y , WIDTH, HEIGHT, COLOR);
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(int x, int y) {
        this(x, y, WIDTH, HEIGHT, COLOR);
    }

    public Rectangle(int x, int y, int width, int height) {
        this(x, y, width, height, COLOR);
    }

    public Rectangle(Color color) {
        this(X, Y, WIDTH, HEIGHT, color);
    }

    public Rectangle(int x, int y, Color color) {
        this(x, y, WIDTH, HEIGHT, color);
    }

    public void draw() {
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.setFill(color);
        SaxionApp.drawRectangle(x, y, width, height);
    }
}
