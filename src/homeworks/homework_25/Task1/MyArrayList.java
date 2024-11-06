package homeworks.homework_25.Task1;

import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * MyArrayList
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */

public class MyArrayList<T> implements MyList<T>, Iterable<T> {
  private T[] values;
  private int cursor;


  /**
   * Инициализирует объект без значений.
   */
  public MyArrayList() {
    this.values = (T[]) new Object[10];
  }


  /**
   * Инициализирует объект с массивом значений.
   *
   * @param array Массив значений.
   */
  public MyArrayList(T[] array) {
    if (array == null || array.length == 0) {
      this.values = (T[]) new Object[10];
    } else {
      this.values = (T[]) new Object[array.length * 2];
      this.addAll(array);
    }
  }


  /**
   * Проверяет, является ли указанный индекс допустимым.
   *
   * @param index Индекс.
   * @return {@code true}, если индекс валиден, иначе {@code false}.
   */
  private boolean isValidIndex(int index) {
    return (index < 0 || index >= this.cursor);
  }


  /**
   * Динамически расширяет внутренний массив.
   */
  private void expandArray() {
    T[] array = (T[]) new Object[this.values.length * 2];

    for (int i = 0; i < this.cursor; i++) {
      array[i] = this.values[i];
    }

    this.values = array;

  }


  /**
   * Добавляет в массив один элемент.
   *
   * @param value Значение.
   * @return Текущий экземпляр класса для цепочки вызовов методов.
   */
  @Override
  public MyArrayList<T> add(T value) {
    // Проверка. Есть ли свободное место во внутреннем массиве.
    if (this.cursor == this.values.length - 1) {
      // Расширить массив перед добавлением нового элемента.
      this.expandArray();
    }

    this.values[this.cursor] = value;
    this.cursor++;

    return this;
  }


  /**
   * Добавляет несколько элементов.
   *
   * @param values T[] Список значений.
   * @return Текущий экземпляр класса для цепочки вызовов методов.
   */
  @Override
  public MyArrayList<T> addAll(T... values) {
    for (int i = 0; i < values.length; i++) {
      this.add(values[i]);
    }

    return this;
  }


  /**
   * Перезаписывает значение по указанному индексу.
   *
   * @param index int Индекс.
   * @param value T Значение.
   */
  @Override
  public void set(int index, T value) {
    if (this.isValidIndex(index)) {
      // TODO: Поправить обработку не корректного индекса.
      return;
    }

    this.values[index] = value;
  }


  /**
   * Возвращает значение по индексу.
   *
   * @return Значение.
   */
  @Override
  public T getValueByIndex(int index) {
    if (this.isValidIndex(index)) {
      // TODO: Поправить обработку не корректного индекса.
      return null;
    }

    return this.values[index];
  }

  /**
   * Удаляет значение.
   *
   * @param value T Значение.
   * @return {@code true}, если удалось удалить, иначе {@code false}.
   */
  @Override
  public boolean remove(T value) {
    int index = this.indexOf(value);

    return (index != -1 && this.removeByIndex(index));
  }


  /**
   * Удаляет элемент по индексу.
   *
   * @return {@code true}, если удалось удалить, иначе {@code false}.
   */
  @Override
  public boolean removeByIndex(int index) {
    if (this.isValidIndex(index)) {
      return false;
    }

    // Смещаем элементы после индекса влево.
    for (int i = index; i < this.cursor - 1; i++) {
      this.values[i] = this.values[i + 1];
    }

    this.cursor--;

    return true;
  }


  /**
   * Проверяет, является ли коллекция пустой.
   *
   * @return boolean
   */
  @Override
  public boolean isEmpty() {
    return (this.size() == 0);
  }


  /**
   * Проверяет, сть ли указанное значение.
   *
   * @param value T Значение.
   * @return
   */
  public boolean contains(T value) {
    return (this.indexOf(value) >= 0);
  }


  /**
   * Возвращает индекс первого вхождения.
   *
   * @param value Значение.
   * @return Индекс первого вхождения или `-1`, если элемент отсутствует.
   */
  public int indexOf(T value) {
    for (int i = 0; i < this.cursor; i++) {
      if (!this.values[i].equals(value)) continue;

      return i;
    }

    return -1;
  }


  /**
   * Возвращает индекс последнего вхождения.
   *
   * @param value Значение.
   * @return Индекс последнего вхождения или `-1`, если элемент отсутствует.
   */
  public int lastIndexOf(T value) {
    for (int i = this.cursor - 1; i >= 0; i--) {
      if (!this.values[i].equals(value)) continue;

      return i;
    }

    return -1;
  }


  /**
   * Возвращает текущее количество элементов.
   *
   * @return Количество элементов.
   */
  public int size() {
    return this.cursor;
  }


  /**
   * Выводит все значения в массиве в консоль.
   */
  public void print() {
    System.out.println(this);
  }


  /**
   * Возвращает обычный массив.
   *
   * @return
   */
  public T[] toArray() {
    if (cursor == 0) {
      return null;
    }

    Class<T> clazz = (Class<T>) this.values[0].getClass();

    T[] result = (T[]) Array.newInstance(clazz, cursor);

    for (int i = 0; i < result.length; i++) {
      result[i] = this.values[i];
    }

    return result;
  }


  /**
   * Возвращает строковое представление массива.
   *
   * @return Строковое представление массива.
   */
  public String toString() {
    String result = "";

    if (this.cursor > 0) {
      for (int i = 0; i < this.cursor; i++) {
        result = (result + this.values[i] + (i < this.cursor - 1 ? ", " : ""));
      }
    }

    return "[" + result + "]";
  }


  @Override
  public Iterator<T> iterator() {
    return new MyIterator();
  }


  private class MyIterator implements Iterator<T> {
    int currentIndex = 0;


    @Override
    public boolean hasNext() {
      return this.currentIndex < cursor;
    }


    @Override
    public T next() {
      return values[this.currentIndex++];
    }
  }

}
