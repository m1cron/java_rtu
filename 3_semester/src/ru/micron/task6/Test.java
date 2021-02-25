package ru.micron.task6;

public class Test {
    public static void main(String[] args) {
        MovablePoint a = new MovablePoint(1, 1);
        a.move(1, 2);
        System.out.println(a);
        MovableCircle b = new MovableCircle("red", true, 2, 1, 1);
        b.move(1, 1);
        MovableRectangle c = new MovableRectangle("blue", false, 3, 4, 2, 2);
        System.out.println(c);
    }
}
