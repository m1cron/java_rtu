package ru.micron;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Human {
    private Integer age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Integer weight;
}
