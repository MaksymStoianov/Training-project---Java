package homeworks.homework_28.Task2;

import homeworks.homework_28.Task1.Rectangle;

/**
 * Test2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test2 {
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(5.0, 3.0);
    Rectangle rect2 = new Rectangle(5.0, 3.0);
    Rectangle rect3 = new Rectangle(4.0, 2.0);

    System.out.println(rect1.equals(rect2)); // Должно быть true
    System.out.println(rect1.equals(rect3)); // Должно быть false
  }
}
