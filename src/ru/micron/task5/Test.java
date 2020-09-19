package ru.micron.task5;

public class Test {
    public static void main(String[] args) {
        System.out.println("-------------- 1 --------------");
        Shape s1 = new Circle("RED", false, 5.5); // Upcast приводим тип класса наследника к классу родителя
        System.out.println(s1); // будет вызван метод из класса Circle
        System.out.println(s1.getArea()); // будет вызван метод из класса Circle
        System.out.println(s1.getPerimeter()); // будет вызван метод из класса Circle
        System.out.println(s1.getColor()); // будет вызван метод из класса Shape
        System.out.println(s1.isFilled()); // будет вызван метод из класса Shape
        //System.out.println(s1.getRadius()); // метода getRadius нет в классе Shape

        System.out.println("-------------- 2 --------------");
        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1); // будет вызван метод из класса Circle
        System.out.println(c1.getArea()); // будет вызван метод из класса Circle
        System.out.println(c1.getPerimeter()); // будет вызван метод из класса Circle
        System.out.println(c1.getColor()); // будет вызван метод из класса Shape
        System.out.println(c1.isFilled()); // будет вызван метод из класса Shape
        System.out.println(c1.getRadius()); // будет вызван метод из класса Circle

        //Shape s2 = new Shape(); // нельзя создать экземпляр абстроктого класса Shape

        System.out.println("-------------- 3 --------------");
        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // Upcast
        System.out.println(s3); // будет вызван метод из класса Rectangle
        System.out.println(s3.getArea()); // будет вызван метод из класса Rectangle
        System.out.println(s3.getPerimeter()); // будет вызван метод из класса Rectangle
        System.out.println(s3.getColor()); // будет вызван метод из класса Shape
        //System.out.println(s3.getLength()); // метода getLength нет в классе Shape

        System.out.println("-------------- 4 --------------");
        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1); // будет вызван метод из класса Rectangle
        System.out.println(r1.getArea()); // будет вызван метод из класса Rectangle
        System.out.println(r1.getColor()); // будет вызван метод из класса Shape
        System.out.println(r1.getLength()); // будет вызван метод из класса Rectangle

        System.out.println("-------------- 5 --------------");
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // будет вызван метод из класса Square
        System.out.println(s4.getArea()); // будет вызван метод из класса Rectangle
        System.out.println(s4.getColor()); // будет вызван метод из класса Shape
        //System.out.println(s4.getSide()); // метода getSide нет в классе Shape

        System.out.println("-------------- 6 --------------");
        Rectangle r2 = (Rectangle) s4; // downcast
        System.out.println(r2); // будет вызван метод из класса Square
        System.out.println(r2.getArea()); // будет вызван метод из класса Rectangle
        System.out.println(r2.getColor()); // будет вызван метод из класса Shape
        //System.out.println(r2.getSide()); // метода getSide нет в классе Rectangle
        System.out.println(r2.getLength()); // будет вызван метод из класса Rectangle

        System.out.println("-------------- 7 --------------");
        Square sq1 = (Square) r2; // Downcast
        System.out.println(sq1); // будет вызван метод из класса Square
        System.out.println(sq1.getArea()); // будет вызван метод из класса Rectangle
        System.out.println(sq1.getColor()); // будет вызван метод из класса Shape
        System.out.println(sq1.getSide()); // будет вызван метод из класса Square
        System.out.println(sq1.getLength()); // будет вызван метод из класса Rectangle
    }
}
