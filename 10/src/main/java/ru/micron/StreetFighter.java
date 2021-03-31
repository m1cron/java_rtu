package ru.micron;

import org.springframework.stereotype.Component;

@Component
public class StreetFighter implements Fighter {

  @Override
  public void doFight() {
    System.out.println("StreetFighter");
  }
}
