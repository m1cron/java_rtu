package ru.micron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    var boxer = context.getBean(Boxer.class);
    boxer.doFight();

    var judoka = context.getBean(Judoka.class);
    judoka.doFight();

    var streetFighter = context.getBean(StreetFighter.class);
    streetFighter.doFight();
  }
}
