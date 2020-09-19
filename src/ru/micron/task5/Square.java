package ru.micron.task5;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setLength(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return String.format("Квадрат {\n\t\tцвет = %s\n\t\tсторона = %s см }", getColor(), getSide());
    }
}