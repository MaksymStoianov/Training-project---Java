package lessons.lesson_05.task_01;

public class Main {
  public static void main(String[] args) {
    int min = 0;
    int max = 5;

    // от min до max
    System.out.println("\n\nfor   // от min до max");
    for (int i = min; i <= max; i++) {
      System.out.println(i);
    }

    // от max до min
    System.out.println("\n\nfor   // от max до min - 1");
    for (int i = max; i > min; --i) {
      System.out.println(i);
    }

    // от max до min с шагом 2
    System.out.println("\n\nfor   // от max до min с шагом 2");
    for (int i = max; i > min; i-=2) {
      System.out.println(i);
    }

    // от max до min но только четные
    System.out.println("\n\nfor   // от max до min но только четные");
    for (int i = max; i > min; i--) {
      // Проверка на четность
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }


    // от max до min но только четные
    System.out.println("\n\nfor   // от max до min но только четные во вложенном цикле");
    for (int i = max; i >= min; i--) {
      for (int j = min; j < max; j++) {
        // Проверка на четность
        if (j % 2 == 0) {
          System.out.println("i: " + i + ", j: " + j);
        }
      }

      if (i == min) {
        System.out.println("End");
      }
    }


    System.out.println("\n\nfor примр вложенного цикла");
    int size = 3;
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if ((row + col) % 2 == 0) {
          System.out.print(" + ");
        } else {
          System.out.print(" - ");
        }
      }
      System.out.println();
    }


    // от max до min
    System.out.println("\n\nwhile");
    int i2 = max;
    while (i2 >= min) {
      System.out.println(i2);
      i2--;
    }

    // от min до max
    System.out.println("\n\ndo ... while");
    int i3 = min;
    do {
      System.out.println(i3);
      ++i3;
    } while (i3 <= max);


    // от min до max (анологично предыдущей)
    System.out.println("\n\ndo ... while");
    int i4 = min;
    do {
      System.out.println(i4);
      i4++;
    } while (i4 <= max);

  }
}
