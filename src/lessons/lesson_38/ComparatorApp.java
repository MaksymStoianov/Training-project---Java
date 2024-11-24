package lessons.lesson_38;

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
    cars[1] = new Car("Car2", 2000, 100);
    cars[2] = new Car("Car3", 2000, 85);
    cars[3] = new Car("Car4", 1980, 180);
    cars[4] = new Car("Car5", 1998, 220);

    StringBuilder formattedOutput1 = new StringBuilder();

    for (int i = 0; i < cars.length; i++) {
      formattedOutput1
          .append(Color.CYAN)
          .append(i + 1)
          .append(". ")
          .append(Color.RESET)
          .append(cars[i])
          .append("\n");
    }

    System.out.println(formattedOutput1);

//    CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
//
//    Arrays.sort(cars, carSpeedComparator);


    System.out.printf(
        "\n%sСортировка по году %s(в порядке убывания)%s:%s%n",
        TextStyle.BOLD,
        Color.PURPLE,
        ("" + Color.RESET + TextStyle.BOLD),
        Color.RESET
    );

    Arrays.sort(
        cars, (car1, car2) -> Integer.compare(car2.getYear(), car1.getYear())
    );

    StringBuilder formattedOutput2 = new StringBuilder();

    for (int i = 0; i < cars.length; i++) {
      formattedOutput2
          .append(Color.CYAN)
          .append(i + 1)
          .append(". ")
          .append(Color.RESET)
          .append(cars[i].toString())
          .append("\n");
    }

    System.out.println(formattedOutput2);



    System.out.printf(
        "\n%sСортировка по году %s(в порядке возрастания)%s, если годы равны то сортируем по скорости:%s%n",
        TextStyle.BOLD,
        Color.PURPLE,
        ("" + Color.RESET + TextStyle.BOLD),
        Color.RESET
    );

    Arrays.sort(
        cars, (car1, car2) -> {
          int result = Integer.compare(car1.getYear(), car2.getYear());

          return (
              result == 0
                  ? Integer.compare(car1.getSpeed(), car2.getSpeed())
                  : result
          );
        }
    );


    StringBuilder formattedOutput3 = new StringBuilder();

    for (int i = 0; i < cars.length; i++) {
      formattedOutput3
          .append(Color.CYAN)
          .append(i + 1)
          .append(". ")
          .append(Color.RESET)
          .append(cars[i])
          .append("\n");
    }

    System.out.println(formattedOutput3);
  }
}
