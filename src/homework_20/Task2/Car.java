package homework_20.Task2;

/**
 * Car
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Car extends Vehicle {
  private int doors;


  public Car(String name, String brand, int doors) {
    super(name, brand);
    this.doors = doors;
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Car}.
   */
  public String toString() {
    return (super.toString() + String.format("\n- Doors: %s", this.doors));
  }

}
