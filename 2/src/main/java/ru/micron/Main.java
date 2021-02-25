package ru.micron;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humans0 = List.of(
                new Human(10, "name1", "lastname1", LocalDate.of(1914, 7, 31), 10),
                new Human(10, "name2", "lastname2", LocalDate.of(2008, 6, 7), 15),
                new Human(10, "name3", "lastname3", LocalDate.of(1950, 1, 31), 20),
                new Human(10, "name4", "lastname4", LocalDate.of(1999, 3, 4), 10),
                new Human(10, "name5", "lastname5", LocalDate.of(2015, 9, 12), 25)
        );
        System.out.println(humans0.stream()
                .peek(a -> a.setWeight(a.getWeight() - 5))
                .filter(a -> a.getBirthDate().isBefore(LocalDate.of(1999, 2, 3)))
                .peek(System.out::println)
                .map(Human::getLastName)
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
