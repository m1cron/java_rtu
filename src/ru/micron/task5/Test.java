package ru.micron.task5;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("black", false, 12);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle("green", false, 3.0, 6.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getLength());

        Shape s4 = new Square(10);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getLength());
    }
}
