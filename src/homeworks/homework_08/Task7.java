package homeworks.homework_08;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
  public static void main(String[] args) {
    // Дан массив целых чисел.

    // Создать массив целых чисел произвольной длины от 5 до 15.
    Random random = new Random();
    int arrLength = random.nextInt(11) + 5;
    int[] arr = new int[arrLength];

    // Заполнить массив случайными значениями от -50 до 50.
    for (int i = 0, max = arr.length; i < max; i++) {
      arr[i] = random.nextInt(101) - 50;
    }

    System.out.println("Создан массив с длинной: " + arrLength);
    System.out.println("arr: " + Arrays.toString(arr));

    // Поменять местами элементы с максимальным и минимальным значениями.
    sortDes(arr);

    System.out.println("sort: " + Arrays.toString(arr));
  }



  /**
   * NOTE: Что-то слишком мудрено у меня получилось, или норм?  :)
   * @param array
   */
  public static void sortDes(int[] array) {
    // Сортировка по возрастанию
    Arrays.sort(array);

    // Сортировка по убыванию
    for (int i = 0, lang = array.length; i < lang / 2; i++) {
      int temp = array[i];
      array[i] = array[lang - 1 - i];
      array[lang - 1 - i] = temp;
    }
  }

}
