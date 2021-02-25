package ru.micron.task2;

import ru.micron.task2.Dog;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("daaun", 4);
        PitomnikDogs pit = new PitomnikDogs();
        System.out.println(dog.getHumanAge());
        pit.add(new Dog("12", 1), new Dog("hhaa", 10));
    }
}
