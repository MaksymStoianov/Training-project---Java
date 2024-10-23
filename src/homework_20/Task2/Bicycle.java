package homework_20.Task2;

/**
 * Bicycle
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Bicycle extends Vehicle {
  private String type;


  public Bicycle(String name, String brand, String type) {
    super(name, brand);
    this.type = type;
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Bicycle}.
   */
  public String toString() {
    return (super.toString() + String.format("\n- Type: %s", this.type));
  }

}
