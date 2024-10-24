package homework_22.Task4;

/**
 * Rectangle
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Rectangle extends Shape {
  double width;
  double height;


  static {
    type = "Rectangle";
  }


  public Rectangle(String name, String color) {
    this.name = name;
    this.color = color;
  }


  /**
   * Устанавливает ширину и высоту.
   *
   * @param width  Ширина.
   * @param height Высота.
   */
  public void setDimensions(double width, double height) {
    this.width = width;
    this.height = height;
  }


  /**
   * Вычисляет площадь прямоугольника.
   */
  @Override
  public void calculateArea() {
    this.area = width * height;
  }

}
