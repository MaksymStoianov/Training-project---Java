package lesson_38;

public enum TextStyle {
  RESET("\u001B[0m"),             // Сброс всех стилей

  BOLD("\u001B[1m"),              // Жирный
  UNDERLINE("\u001B[4m"),         // Подчеркнутый
  BLINK("\u001B[5m"),             // Мигающий
  REVERSE("\u001B[7m");           // Инверсия


  private final String code;


  TextStyle(String code) {
    this.code = code;
  }


  @Override
  public String toString() {
    return code;
  }
}
