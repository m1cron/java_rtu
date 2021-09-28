package ru.micron;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Config {

  @Bean
  @Scope("prototype")
  public Boxer boxer() {
    return new Boxer();
  }

  @Bean
  @Scope("prototype")
  public StreetFighter streetFighter() {
    return new StreetFighter();
  }

  @Bean
  @Scope("prototype")
  public Judoka judoka() {
    return new Judoka();
  }

}
