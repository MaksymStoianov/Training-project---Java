package homeworks.Task1;

/**
 * Triangle
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Triangle extends Shape {
  private double a;
  private double b;
  private double c;


  static {
    type = "Triangle";
  }


  public Triangle(String name, String color) {
    this.name = name;
    this.color = color;
  }


  /**
   * Устанавливает стороны треугольника.
   *
   * @param a Сторона `a`.
   * @param b Сторона `b`.
   * @param c Сторона `c`.
   */
  public void setDimensions(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }


  /**
   * Вычисляет площадь треугольника.
   */
  @Override
  public void calculateArea() {
    // Полупериметр
    double p = (a + b + c) / 2;

    // Площадь
    this.area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
