package homeworks.homework_19.Task5;

import homeworks.homework_18.Task2.Dog;

import java.util.Random;

/**
 * Task5
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task5 {
  public static void main(String[] args) {
    Random random = new Random();

    Dog[] dogs = new Dog[5];

    for (int i = 0; i < dogs.length; i++) {
      int jumpHeight = random.nextInt(51) + 30;

      dogs[i] = new Dog("Dog" + (i + 1), jumpHeight);
    }


    int[] barriers = new int[7];

    for (int i = 0; i < barriers.length; i++) {
      barriers[i] = random.nextInt(101) + 70;
    }


    for (Dog dog : dogs) {
      int count = 0;

      System.out.print("Собака \"" + dog.getName() + "\"");

      for (int barrier : barriers) {
        boolean result = (dog.jumpBarrier(barrier) == 3);

        if (result) {
          count++;
        }

        // System.out.print("\n Барьер: " + barrier + " = " + (result ? "" : "не") + "преодолела барьер.");
      }

      System.out.print(" преодолела " + count + " барьеров.\n");
    }
  }
}
