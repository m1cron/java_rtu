package ru.micron.patterns.Abstract_Factory;

public class WindowsButton implements Button {

  @Override
  public void paint() {
    System.out.println("You have created WindowsButton.");
  }

}
