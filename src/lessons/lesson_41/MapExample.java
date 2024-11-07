package lessons.lesson_41;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * MapExample
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class MapExample {
  public static void main(String[] args) {
    Map<Integer, String> oldMap = new Hashtable<>();

    Map<Integer, String> map1 = new HashMap<>();

    map1.put(1, "hi");
    System.out.println(map1);
  }
}
