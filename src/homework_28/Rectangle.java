package homework_28;

import homework_25.MyList;

import java.util.Objects;

/**
 * Rectangle
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Rectangle {
  private double width;
  private double height;


  /**
   * Удаляет дубликаты из массива.
   *
   * @param rectangles
   * @param rectangle
   */
  public static void removeDuplicates(MyList<Rectangle> rectangles, Rectangle rectangle) {
    boolean foundFirst = false;

    for (int i = rectangles.size() - 1; i >=0; i--) {
      Rectangle value = rectangles.getValueByIndex(i);

      if (value.equals(rectangle)) {
        if (foundFirst) {
          rectangles.removeByIndex(i);
        } else {
          foundFirst = true;
        }
      }
    }
  }


  public Rectangle() {
    this.width = 1;
    this.height = 1;
  }


  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Rectangle rectangle)) {
      return false;
    }

    return (
        Double.compare(this.width, rectangle.width) == 0 &&
        Double.compare(this.height, rectangle.height) == 0
    );
  }


  @Override
  public int hashCode() {
    return Objects.hash(this.width, this.height);
  }


  public double getWidth() {
    return this.width;
  }


  public void setWidth(double width) {
    this.width = width;
  }


  public double getHeight() {
    return this.height;
  }


  public void setHeight(double height) {
    this.height = height;
  }


  @Override
  public String toString() {
    return "Прямоугольник[" +
           "длина= " + this.width +
           ", ширина= " + this.height +
           ']';
  }
}
