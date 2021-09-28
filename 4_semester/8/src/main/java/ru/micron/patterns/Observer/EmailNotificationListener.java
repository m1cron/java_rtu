package ru.micron.patterns.Observer;

import java.io.File;
import lombok.Data;

@Data
public class EmailNotificationListener implements EventListener {

  private final String email;

  @Override
  public void update(String eventType, File file) {
    System.out.println("Email to " + email + ": Someone has performed " + eventType
        + " operation with the following file: " + file.getName());
  }

}
