package ru.micron;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Student implements Comparable<Student> {
    private Integer totalScores;

    public static String out(int result) {
        return result > 0 ? "left" : result == 0 ? "==" : "right";
    }

    @Override
    public int compareTo(Student o) {
        return this.totalScores - o.getTotalScores();
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.out(new Student(100).compareTo(new Student(100))));
        System.out.println(Student.out(new Student(1000).compareTo(new Student(100))));
        System.out.println(Student.out(new Student(100).compareTo(new Student(1000))));
    }
}
