package lessons.lesson_09.task_01;

import lessons.lesson_09.ArrayUtils;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

//    int arrayLength = 25;
//    int max = 10;
//    int[] array = ArrayUtils.getRandomArray(arrayLength, 0, max);
//    System.out.println(Arrays.toString(array));
//    System.out.println();
//
//
//    Random random = new Random();
//    int number = random.nextInt(max + 1);
//    int result = ArrayUtils.linearSearchIndex(array, number);
//    System.out.println("Число " + number + (result >= 0 ? " найдео в индексе " + result + "." : " не найдено!"));
//    System.out.println();
//
//
//    int[] array2 = ArrayUtils.getRandomArray(arrayLength, 0, max);
//    System.out.println(Arrays.toString(array2));
//    ArrayUtils.bubbleSort(array2);
//    System.out.println("Отсортирован: " + Arrays.toString(array2));
//    System.out.println();
//
//
//    int[] array3 = array2;
//    int number3 = random.nextInt(max + 1);
//    int result3 = ArrayUtils.binarySearch(array3, number3);
//    System.out.println(Arrays.toString(array3));
//    System.out.println("Индекс числа " + number3 + " (двоичный поиск): " + result3);


    int[] array4 = {1, 3, 7, 8, 10, 15, 17, 17, 18, 26, 27, 27, 28, 29, 30, 31, 33, 36, 37, 39, 40, 43, 43, 43, 43, 44, 46, 47, 48, 49};
    int number4 = 29;
    int result4 = ArrayUtils.binarySearch(array4, number4);
    System.out.println(Arrays.toString(array4));
    System.out.println("Индекс числа " + number4 + " (двоичный поиск): " + result4);
  }

}
