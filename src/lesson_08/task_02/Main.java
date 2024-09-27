package lesson_08.task_02;

public class Main {
  public static void main(String[] args) {
    int[] nums = new int[50];

    for (int i = 0, num = 1; num < 100; num += 2, i++) {
      nums[i] = num;
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.print(nums[i] + " ");
    }

    // 1. Создайте массив из всех нечётных чисел от 1 до 99,
    // выведите его на экран в строку в обратном порядке
  }
}
