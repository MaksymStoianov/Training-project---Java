package lessons.lesson_08.Randomizer;

import java.util.Random;

public class Randomizer {
  public static void main(String[] args) {
    String[] names = {
        "Max",
        "T",
        "Se",
        "Y",
        "Sv"
    };

    Random random = new Random();

    int val1 = random.nextInt(names.length);

    System.out.println(names[val1]);
  }
}
