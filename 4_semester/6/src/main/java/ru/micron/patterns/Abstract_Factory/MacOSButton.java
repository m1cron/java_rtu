package ru.micron.patterns.Abstract_Factory;

public class MacOSButton implements Button {

  @Override
  public void paint() {
    System.out.println("You have created MacOSButton.");
  }

}
