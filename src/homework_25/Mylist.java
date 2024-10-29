package homework_25;

/**
 * Mylist
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
interface MyList<T> {

  /**
   * Добавляет элемент.
   *
   * @param value Значение.
   */
  MyList<T> add(T value);


  /**
   * Добавляет несколько элементов.
   *
   * @param values T[] Список значений.
   */
  MyList<T> addAll(T... values);


  /**
   * Перезаписывает значение по указанному индексу.
   *
   * @param index int Индекс.
   * @param value T Значение.
   */
  void set (int index, T value);


  /**
   * Получает значение по индексу.
   *
   * @param index int Индекс.
   * @return value
   */
  T getValueByIndex(int index);



  /**
   * Удаляет значение.
   *
   * @param value T Значение.
   * @return {@code true}, если удалось удалить, иначе {@code false}.
   */
  boolean remove(T value);


  /**
   * Удаляет элемент по индексу.
   *
   * @param index int Индекс.
   * @return Возвращает значение удаленного элемента.
   */
  boolean removeByIndex(int index);



  /**
   * Проверяет, является ли коллекция пустой.
   *
   * @return boolean
   */
  boolean isEmpty();



  /**
   * Возвращает количество элементов в массиве.
   * @return int Количество элементов в массиве.
   */
  int size();


  /**
   * Возвращает индекс элемента.
   *
   * @param value T Значение,
   * @return int Индекс элемента.
   */
  int indexOf(T value);


  /**
   * Возвращает индекс последнего вхождения.
   *
   * @param value T Значение.
   * @return int Индекс последнего вхождения.
   */
  int lastIndexOf(T value);


  /**
   * Проверяет, содержит ли массив элемент с таким значением.
   *
   * @param value T Значение.
   * @return boolean
   */
  boolean contains(T value);


  /**
   * Возвращает представление элементов в виде массива.
   * @return Array Представление элементов в виде массива.
   */
  T[] toArray();

}