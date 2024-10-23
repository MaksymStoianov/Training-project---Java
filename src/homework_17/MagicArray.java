package homework_17;

/**
 * MagicArray
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class MagicArray {

  int[] values;
  int cursor;


  /**
   * Инициализирует объект {@code MagicArray} без значений.
   */
  public MagicArray() {
    this.values = new int[10];
  }


  /**
   * Инициализирует объект {@code MagicArray} с массивом значений.
   *
   * @param array Массив значений.
   */
  public MagicArray(int[] array) {
    this.values = new int[10];

    if (array != null && array.length > 0) {
      this.add(array);
    }
  }


  /**
   * Проверяет, является ли указанный индекс допустимым.
   *
   * @param index Индекс.
   * @return {@code true}, если индекс валиден, иначе {@code false}.
   */
  private boolean isValidIndex(int index) {
    return (index >= 0 && index < this.cursor);
  }


  /**
   * Динамически расширяет внутренний массив.
   */
  private void expandArray() {
    int[] array = new int[this.values.length * 2];

    for (int i = 0; i < this.cursor; i++) {
      array[i] = this.values[i];
    }

    this.values = array;
  }


  /**
   * Добавляет в массив один элемент.
   *
   * @param value Значение.
   * @return Текущий экземпляр класса {@code MagicArray} для цепочки вызовов методов.
   */
  public MagicArray add(int value) {
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
   * Добавляет одно или несколько чисел.
   *
   * @param numbers Одно или несколько целых чисел.
   * @return Текущий экземпляр класса {@code MagicArray} для цепочки вызовов методов.
   */
  public MagicArray add(int... numbers) {
    for (int i = 0; i < numbers.length; i++) {
      this.add(numbers[i]);
    }

    return this;
  }


  /**
   * Возвращает значение по индексу.
   *
   * @return Значение.
   */
  public int getValueByIndex(int index) {
    if (!this.isValidIndex(index)) {
      // TODO: Поправить обработку не корректного индекса.
      return Integer.MIN_VALUE;
    }

    return this.values[index];
  }


  /**
   * Удаляет элемент по индексу.
   *
   * @return {@code true}, если удалось удалить, иначе {@code false}.
   */
  public boolean removeValueByIndex(int index) {
    if (!this.isValidIndex(index)) {
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
   * Удаляет элемент по значению.
   *
   * @return {@code true}, если удалось удалить, иначе {@code false}.
   */
  public boolean remove(int value) {
    int index = this.indexOf(value);

    return (index != -1 && this.removeValueByIndex(index));
  }


  /**
   * Возвращает индекс первого вхождения.
   *
   * @param value Значение.
   * @return Индекс первого вхождения или `-1`, если элемент отсутствует.
   */
  public int indexOf(int value) {
    for (int i = 0; i < this.cursor; i++) {
      if (this.values[i] != value) continue;

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
  int lastIndexOf(int value) {
    for (int i = this.cursor - 1; i >= 0; i--) {
      if (this.values[i] != value) continue;

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

}
