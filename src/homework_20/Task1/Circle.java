package homework_20.Task1;

/**
 * Circle
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Circle extends Shape {
  double radius;

  static {
    type = "Circle";
  }


  public Circle(String name, String color) {
    this.name = name;
    this.color = color;
  }


  /**
   * Устанавливает радиус.
   *
   * @param radius Радиус.
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }


  /**
   * Вычисляет площадь круга.
   */
  public void calculateArea() {
    this.area = Math.PI * Math.pow(radius, 2);
  }

}
