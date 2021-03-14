package ru.micron.patterns.Abstract_Factory;

public class MacOSFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }

}
