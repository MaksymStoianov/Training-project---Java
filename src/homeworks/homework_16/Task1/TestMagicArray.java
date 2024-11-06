package homeworks.homework_16.Task1;

/**
 * TestMagicArray
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class TestMagicArray {
  public static void main(String[] args) {

    MagicArray array = new MagicArray();

    array.add(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println(array.toString());

    int index = array.indexOf(5);
    System.out.println("Индекс элемента: " + index);

    boolean isDeleted1 = array.removeValueByIndex(3);
    System.out.println("isDeleted1: " + isDeleted1);
    System.out.println(array.toString());

    array.add(1555);
    System.out.println(array.toString());

    boolean isDeleted2 = array.remove(7);
    System.out.println("isDeleted2: " + isDeleted2);
    System.out.println(array.toString());

    boolean isDeleted3 = array.remove(10000000);
    System.out.println("isDeleted3: " + isDeleted3);
    System.out.println(array.toString());

  }
}
