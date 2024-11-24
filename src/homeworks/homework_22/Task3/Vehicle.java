package homeworks.homework_22.Task3;

/**
 * Parent
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Vehicle {
  private final String name;
  private final String brand;
  String engine;


  public Vehicle(String name, String brand) {
    this.name = name;
    this.brand = brand;
  }


  /**
   * Запустить двигатель.
   */
  public void startEngine() {
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Vehicle}.
   */
  public String toString() {
    return String.format(
        "Name: %s\n- Brand: %s",
        this.name,
        this.brand
    );
  }
}
