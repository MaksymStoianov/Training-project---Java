package homeworks.homework_22.Task3;

/**
 * Bicycle
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Bicycle extends Vehicle {


  public Bicycle(String name, String brand, String engine) {
    super(name, brand);
    this.engine = engine;
  }


  /**
   * Запустить двигатель.
   */
  @Override
  public void startEngine() {
    if (this.engine != null) {
      System.out.println("Bicycle: Двигатель запущен!");
    } else {
      System.out.println("Bicycle: Двигатель не установлен!");
    }
  }

}
