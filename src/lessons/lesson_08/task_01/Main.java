package lessons.lesson_08.task_01;

import lessons.lesson_02.task_03.Student;
import lessons.lesson_04.task_02.Cat;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] numbers = new int[10];
    numbers[3] = 27;

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(i + ": " + numbers[i]);
    }

    System.out.println();

    for (int number : numbers) {
      System.out.print(number + " ");
    }

    System.out.println();
    int[] numbers1 = {1, 444, 452, 1};
    System.out.println(Arrays.toString(numbers1));


    System.out.println();

    Student[] students = new Student[10];
    students[5] = new Student();
    students[5].study();
    System.out.println(Arrays.toString(students));

    System.out.println();

    Cat[] cats = {
        new Cat(5),
        new Cat(4),
        new Cat(3)
    };

    Cat[] cats1 = cats.clone();
    System.out.println(Arrays.toString(cats1));
    System.out.println("Возраст кота: " + cats1[1].getAge());

    System.out.println();


    int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    // Создаем копию массива, первых 3 элментов
    int[] arr2 = Arrays.copyOf(arr1, 3);
    System.out.println(Arrays.toString(arr2));

    // Копируем из arr1 в arr3, часть массива в указанное место с указанной длинной
    int[] arr3 = new int[10];
    System.arraycopy(arr1, 2, arr3, 5, 4);
    System.out.println(Arrays.toString(arr3));

    // Копируем с по (не включительно)
    int[] arr4 = Arrays.copyOfRange(arr1, 3, 7);
    System.out.println(Arrays.toString(arr4));

    // Сортирует массив на месте
    Arrays.sort(arr1);

  }
}
