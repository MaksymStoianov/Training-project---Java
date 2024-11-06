package homeworks.homework_22.Task3;

/**
 * Main
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Tests {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Car("Car1", "brand1", "Engine1");
    vehicles[1] = new Bicycle("Bicycle1", "brand2", null);
    vehicles[2] = new Motorcycle("Motorcycle1", "brand2", "Engine1");

    for (int i = 0; i < vehicles.length; i++) {
      System.out.println(vehicles[i]);
      vehicles[i].startEngine();
    }

  }
}
