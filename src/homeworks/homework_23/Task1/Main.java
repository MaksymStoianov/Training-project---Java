package homeworks.homework_23.Task1;

/**
 * Main
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Main {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle("Rectangle1", "blue");
    rectangle1.setDimensions(10, 20);
    rectangle1.calculateArea();
    rectangle1.displayInfo();

    Circle circle1 = new Circle("Circle1", "red");
    circle1.setRadius(10);
    circle1.calculateArea();
    circle1.displayInfo();

    Triangle triangle1 = new Triangle("Triangle1", "green");
    triangle1.setDimensions(5, 6, 7);
    triangle1.calculateArea();
    triangle1.displayInfo();
  }
}
