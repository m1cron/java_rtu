package ru.micron.task3.circle;

import ru.micron.task3.circle.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(15);
        circle.setD();
        circle.setL(3.14);
        circle.setS(3.14);
        System.out.printf("R= %d\nD= %d\nL= %f\nS= %f", circle.getR(), circle.getD(),
                            circle.getL(), circle.getS());
    }
}
