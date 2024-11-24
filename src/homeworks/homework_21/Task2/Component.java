package homeworks.homework_21.Task2;

/**
 * Component
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Component {
  private String brand;
  private String model;


  public Component(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }


  /**
   * Возвращает бренд компонента.
   *
   * @return Бренд.
   */
  public String getBrand() {
    return brand;
  }


  /**
   * Возвращает модель компонента.
   *
   * @return Модель.
   */
  public String getModel() {
    return model;
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Component}.
   */
  public String toString() {
    return String.format("Component:\n- Brand: %s\n- Model: %s", this.brand, this.model);
  }
}
