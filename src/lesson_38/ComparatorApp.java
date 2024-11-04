package lesson_38;

import java.util.Arrays;

/**
 * ComparatorApp
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class ComparatorApp {
  public static void main(String[] args) {
    Car[] cars = new Car[5];

    cars[0] = new Car("Car1", 1992, 120);
    cars[1] = new Car("Car2", 1850, 75);
    cars[2] = new Car("Car3", 2000, 240);
    cars[3] = new Car("Car4", 1980, 180);
    cars[4] = new Car("Car5", 1998, 220);

    CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

    Arrays.sort(cars, carSpeedComparator);

    System.out.println(Arrays.toString(cars));
  }
}
