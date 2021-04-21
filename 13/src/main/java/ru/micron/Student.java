package ru.micron;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student implements CommandLineRunner {

  @Value("${student.name}")
  private String studentName;

  @Value("${student.last_name}")
  private String studentLastName;

  @Value("${student.group}")
  private String studentGroup;

  @Override
  public void run(String... args) throws Exception {
    System.out.println(this.toString());
  }
}
