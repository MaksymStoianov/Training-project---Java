package homeworks.homework_40.Task2;

import java.util.HashSet;
import java.util.Set;

/**
 * SetUtils
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class SetUtils {

  /**
   * Возвращает объединение двух множеств.
   * Объединение включает все элементы из первого и второго множества.
   *
   * @param set1 Первое множество.
   * @param set2 второе множество.
   * @param <T> Тип элементов в множествах
   * @return Новое множество, содержащее объединение элементов из set1 и set2.
   */
  public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
    Set<T> result = new HashSet<>(set1);
    result.addAll(set2);
    return result;
  }


  /**
   * Возвращает пересечение двух множеств.
   * Пересечение включает только те элементы, которые присутствуют и в первом, и во втором множестве.
   *
   * @param set1 Первое множество.
   * @param set2 второе множество.
   * @param <T> Тип элементов в множествах
   * @return Новое множество, содержащее пересечение элементов из set1 и set2.
   */
  public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
    Set<T> result = new HashSet<>(set1);
    result.retainAll(set2);
    return result;
  }


  /**
   * Возвращает разность двух множеств.
   * Разность включает только те элементы, которые присутствуют в первом множестве, но отсутствуют во втором.
   *
   * @param set1 Первое множество.
   * @param set2 второе множество.
   * @param <T> Тип элементов в множествах
   * @return Новое множество, содержащее разность элементов из set1 и set2.
   */
  public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
    Set<T> result = new HashSet<>(set1);
    result.removeAll(set2);
    return result;
  }

}
