package ru.micron.patterns.Abstract_Factory;

public class MacOSCheckbox implements Checkbox {

  @Override
  public void paint() {
    System.out.println("You have created MacOSCheckbox.");
  }

}
