package homeworks.homework_32.Layers.utils;

/**
 * MyList
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public interface MyList<T> extends Iterable<T> {

  /**
   * Возвращает количество элементов в массиве.
   *
   * @return int Количество элементов в массиве.
   */
  int size();


  /**
   * Добавляет элемент.
   *
   * @param value
   */
  void add(T value);


  /**
   * Добавляет несколько элементов.
   *
   * @param values T[]
   */
  void addAll(T... values);


  /**
   * Перезаписывает значение по указанному индексу.
   *
   * @param index int
   * @param value T
   */
  void set(int index, T value);


  /**
   * Возвращает значение по индексу.
   *
   * @param index int
   * @return value
   */
  T get(int index);


  /**
   * Удаляет один элемент по значению.
   *
   * @param value T
   * @return boolean {@code true} в случае успешного удаления.
   */
  boolean remove(T value);


  /**
   * Удаляет элемент по индексу.
   *
   * @param index int
   * @return Возвращает значение удаленного элемента.
   */
  T remove(int index);


  /**
   * Возвращает индекс элемента по значению.
   *
   * @param value T
   * @return int Индекс элемента.
   */
  int indexOf(T value);


  /**
   * Возвращает последний индекс элемента по значению.
   *
   * @param value T
   * @return int Индекс последнего вхождения.
   */
  int lastIndexOf(T value);


  /**
   * Содержит ли массив элемент с таким значением.
   *
   * @param value T
   * @return boolean
   */
  boolean contains(T value);


  /**
   * Является ли коллекция пустой.
   *
   * @return boolean {@code true}, если в коллекции нет элементов.
   */
  boolean isEmpty();


  /**
   * Возвращает представление элементов в виде массива.
   *
   * @return Array Представление элементов в виде массива.
   */
  T[] toArray();

}