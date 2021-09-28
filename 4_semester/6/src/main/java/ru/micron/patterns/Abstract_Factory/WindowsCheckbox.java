package ru.micron.patterns.Abstract_Factory;

public class WindowsCheckbox implements Checkbox {

  @Override
  public void paint() {
    System.out.println("You have created WindowsCheckbox.");
  }

}