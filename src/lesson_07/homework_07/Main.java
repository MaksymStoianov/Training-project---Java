package lesson_07.homework_07;

public class Main {
  public static void main(String[] args) {
    int min = 0;
    int max = 30;

    System.out.println("Task 1.A");
    for (int i = max; i >= min; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    System.out.println("\n\nTask 1.B");
    for (int i = max; i >= min; i-=2) {
        System.out.println(i);
    }

  }
}
