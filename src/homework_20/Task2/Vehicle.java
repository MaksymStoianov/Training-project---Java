package homework_20.Task2;

/**
 * Parent
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Vehicle {
  String name;
  String brand;


  public Vehicle(String name, String brand) {
    this.name = name;
    this.brand = brand;
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Vehicle}.
   */
  public String toString() {
    return String.format("Name: %s\n- Brand: %s", this.name, this.brand);
  }
}
