package homeworks.homework_32.Layers.utils;

import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * MyArrayList
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class MyArrayList<T> implements MyList<T>, Iterable<T> {
  private T[] array;
  private int cursor;


  @SuppressWarnings("unchecked")
  public MyArrayList() {
    this.array = (T[]) new Object[10];
  }


  @SuppressWarnings("unchecked")
  public MyArrayList(T[] array) {
    if (array == null || array.length == 0) {
      this.array = (T[]) new Object[10];
    } else {
      this.array = (T[]) new Object[array.length * 2];
      this.addAll(array);
    }
  }


  /**
   * Возвращает количество элементов в массиве.
   *
   * @return int Количество элементов в массиве.
   */
  public int size() {
    return this.cursor;
  }


  /**
   * Добавляет элемент.
   *
   * @param value
   */
  public void add(T value) {
    if (this.cursor == this.array.length - 1) {
      this.expandArray();
    }

    this.array[this.cursor] = value;
    this.cursor++;
  }


  /**
   * Добавляет несколько элементов.
   *
   * @param numbers T[]
   */
  @Override
  public void addAll(T... numbers) {
    for (T number : numbers) {
      this.add(number);
    }
  }


  /**
   * Перезаписывает значение по указанному индексу.
   *
   * @param index int
   * @param value T
   */
  @Override
  public void set(int index, T value) {
    if (index >= 0 && index < cursor) {
      array[index] = value;
    }
  }


  /**
   * Возвращает значение по индексу.
   *
   * @param index int
   * @return value
   */
  @Override
  public T get(int index) {
    if (index >= 0 && index < this.cursor) {
      return this.array[index];
    }

    // TODO: Написать код, если индекс "не корректный".
    return null;
  }


  /**
   * Удаляет элемент по индексу.
   *
   * @param index int
   * @return Возвращает значение удаленного элемента.
   */
  public T remove(int index) {
    if (index >= 0 && index < this.cursor) {
      T value = this.array[index];

      for (int i = index; i < this.cursor - 1; i++) {
        this.array[i] = this.array[i + 1];
      }

      this.cursor--;

      return value;
    }

    // TODO: Индекс не валидный.
    return null;
  }


  /**
   * Удаляет один элемент по значению.
   *
   * @param value T
   * @return boolean {@code true} в случае успешного удаления.
   */
  @Override
  public boolean remove(T value) {
    int index = this.indexOf(value);

    if (index == -1) {
      return false;
    }

    this.remove(index);

    return true;
  }


  /**
   * Возвращает индекс элемента по значению.
   *
   * @param value T
   * @return int Индекс элемента.
   */
  public int indexOf(T value) {
    for (int i = 0; i < this.cursor; i++) {
      if (this.array[i].equals(value)) {
        return i;
      }
    }

    return -1;
  }


  /**
   * Возвращает последний индекс элемента по значению.
   *
   * @param value T
   * @return int Индекс последнего вхождения.
   */
  public int lastIndexOf(T value) {
    for (int i = this.cursor - 1; i >= 0; i--) {
      if (this.array[i].equals(value)) {
        return i;
      }
    }

    return -1;
  }


  /**
   * Содержит ли массив элемент с таким значением.
   *
   * @param value T
   * @return boolean
   */
  @Override
  public boolean contains(T value) {
    return (this.indexOf(value) >= 0);
  }


  /**
   * Является ли коллекция пустой.
   *
   * @return boolean {@code true}, если в коллекции нет элементов.
   */
  @Override
  public boolean isEmpty() {
    return (this.cursor == 0);
  }


  /**
   * Динамическое расширение массива.
   */
  private void expandArray() {
    T[] newArray = (T[]) new Object[this.array.length * 2];

    for (int i = 0; i < this.cursor; i++) {
      newArray[i] = this.array[i];
    }

    this.array = newArray;
  }


  /**
   * Возвращает строковое представление массива.
   *
   * @return
   */
  public String toString() {
    if (cursor == 0) {
      return "[]";
    }

    StringBuilder result = new StringBuilder("[");

    for (int i = 0; i < cursor; i++) {
      result
          .append(array[i])
          .append(i < cursor - 1 ? ", " : "]");
    }

    return result.toString();
  }


  /**
   * Возвращает представление элементов в виде массива.
   *
   * @return Array Представление элементов в виде массива.
   */
  @SuppressWarnings("unchecked")
  @Override
  public T[] toArray() {
    if (this.cursor == 0) {
      return null;
    }

    Class<T> clazz = (Class<T>) this.array[0].getClass();

    T[] result = (T[]) Array.newInstance(clazz, this.cursor);

    for (int i = 0; i < result.length; i++) {
      result[i] = this.array[i];
    }

    return result;
  }


  @Override
  public Iterator<T> iterator() {
    return new MyIterator();
  }


  private class MyIterator implements Iterator<T> {
    int currentIndex = 0;


    @Override
    public boolean hasNext() {
      return currentIndex < cursor;
    }


    @Override
    public T next() {
      return array[currentIndex++];
    }
  }

}
