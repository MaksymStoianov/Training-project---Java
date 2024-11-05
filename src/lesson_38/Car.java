package lesson_38;

/**
 * Car
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Car implements Comparable<Car>{
  private String name;
  private int speed;
  private int year;

  public Car(String name, int year, int speed) {
    this.name = name;
    this.year = year;
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return String.format(
        "Car{ %sname%s:%-10s %sspeed%s:%-5s %syear%s:%-5s }",
        Color.CYAN,
        Color.RESET,
        "\"" + this.name + "\"" + ",",

        Color.CYAN,
        Color.RESET,
        this.speed + ",",

        Color.CYAN,
        Color.RESET,
        this.year
    );
  }

  @Override
  public int compareTo(Car car1) {
    return this.year - car1.year;
  }
}
