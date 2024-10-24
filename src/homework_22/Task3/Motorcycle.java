package homework_22.Task3;

/**
 * Motorcycle
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Motorcycle extends Vehicle {

  public Motorcycle(String name, String brand, String engine) {
    super(name, brand);
    this.engine = engine;
  }


  /**
   * Запустить двигатель.
   */
  public void startEngine() {
    if (this.engine != null) {
      System.out.println("Motorcycle: Двигатель запущен!");
    } else {
      System.out.println("Motorcycle: Двигатель не установлен!");
    }
  }

}
