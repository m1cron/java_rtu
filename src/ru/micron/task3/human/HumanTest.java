package ru.micron.task3.human;

import ru.micron.task3.human.Human;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("Max", 180);
        human.getHumanInfo();
        System.out.println(human.toString());
    }
}
