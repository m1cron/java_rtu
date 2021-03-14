package ru.micron.patterns.Factory_Method;

public class Demo {
  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  /**
   * Приложение создаёт определённую фабрику в зависимости от конфигурации или
   * окружения.
   */
  static void configure() {
    if (System.getProperty("os.name").equals("Windows 10")) {
      dialog = new WindowsDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  /**
   * Весь остальной клиентский код работает с фабрикой и продуктами только
   * через общий интерфейс, поэтому для него неважно какая фабрика была
   * создана.
   */
  static void runBusinessLogic() {
    dialog.renderWindow();
  }
}
