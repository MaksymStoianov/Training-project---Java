package homework_22.Task3;

/**
 * Car
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Car extends Vehicle {

  public Car(String name, String brand, String engine) {
    super(name, brand);
    this.engine = engine;
  }


  /**
   * Запустить двигатель.
   */
  @Override
  public void startEngine() {
    if (this.engine != null) {
      System.out.println("Car: Двигатель запущен!");
    } else {
      System.out.println("Car: Двигатель не установлен!");
    }
  }

}
