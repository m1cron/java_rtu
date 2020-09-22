package ru.micron.task6;

import ru.micron.task5.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {
    MovablePoint cntr;

    public MovableRectangle(String color, boolean filled, double width, double length, double x, double y) {
        super(color, filled, width, length);
        this.cntr = new MovablePoint(x, y);
    }

    public double getX() {
        return this.cntr.getX();
    }

    public void setX(double x) {
        this.cntr.setX(x);
    }

    public double getY() {
        return this.cntr.getY();
    }

    public void setY(double y) {
        this.cntr.setY(y);
    }

    @Override
    public void move(double x, double y) {
        this.cntr.move(x, y);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                super.toString() +
                ", x=" + this.cntr.getX() +
                ", y=" + this.cntr.getY() +
                '}';
    }
}
