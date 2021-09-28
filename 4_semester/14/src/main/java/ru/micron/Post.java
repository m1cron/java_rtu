package ru.micron;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Post {

  private String text = "text";
  private String creationDate = "2021";
}
