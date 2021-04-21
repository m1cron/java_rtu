package ru.micron;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class User {

  private String firstName = "firstName";
  private String lastName = "lastName";
  private String middleName = "middleName";
  private String birthDate = "birthDate";
}
