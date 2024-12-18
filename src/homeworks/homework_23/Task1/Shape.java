package homeworks.homework_23.Task1;

/**
 * Shape
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
abstract class Shape {
  static String type;
  String name;
  String color;
  double area;


  /**
   * Устанавливает имя.
   *
   * @param name Имя.
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Выводит в консоль название фигуры.
   */
  public void displayInfo() {
    System.out.println(this);
  }


  /**
   * Вычисляет площадь.
   */
  public abstract void calculateArea();


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Shape}.
   */
  public String toString() {
    return String.format("%s:\n- Name: %s\n- Area: %.2f\n- Color: %s", type, this.name, this.area, this.color);
  }
}
