package homeworks.homework_28;

import homeworks.homework_25.MyArrayList;
import homeworks.homework_25.MyList;

/**
 * Task3
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test3 {
  public static void main(String[] args) {
    MyList<Rectangle> rectangles = new MyArrayList<>();

    rectangles.add(new Rectangle(5.0, 3.0));
    rectangles.add(new Rectangle(4.0, 2.0));
    rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
    rectangles.add(new Rectangle(6.0, 4.0));
    rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

    System.out.println("Список до удаления дубликатов:");
    for (Rectangle rect : rectangles) {
      System.out.println(rect);
    }

    Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
    Rectangle.removeDuplicates(rectangles, rectangleToRemove);

    System.out.println("\nСписок после удаления дубликатов:");
    for (Rectangle rect : rectangles) {
      System.out.println(rect);
    }
  }
}
