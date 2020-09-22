package ru.micron.task6;

public class MovablePoint implements Movable {
    double x, y;

    public MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
