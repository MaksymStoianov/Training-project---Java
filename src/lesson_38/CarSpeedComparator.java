package lesson_38;

import java.util.Comparator;

/**
 * CarSpeedComparator
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class CarSpeedComparator implements Comparator<Car> {
  @Override
  public int compare(Car car1, Car car2) {
    return car1.getSpeed() - car2.getSpeed();
  }
}
