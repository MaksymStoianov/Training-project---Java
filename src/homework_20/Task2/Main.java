package homework_20.Task2;

import javax.sound.midi.Soundbank;

/**
 * Main
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Car1", "brand1", 4);
    System.out.println(car1.toString());

    Bicycle bicycle1 = new Bicycle("Bicycle1", "brand2", "type1");
    System.out.println(bicycle1.toString());
  }
}
