package homework_08.old;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();

    int[] nums1 = new int[15];
    int numberOfEven = 0;

    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = random.nextInt(20) + 1;

      if (nums1[i] % 2 == 0) {
        numberOfEven++;
      }
    }

    System.out.println(Arrays.toString(nums1));
    System.out.println("Кол-во чётных чисел: " + numberOfEven);

    System.out.println();

    int[] nums2 = new int[20];
    int max = 0;
    int min = 50;

    for (int i = nums2.length - 1; i >= 0; i--) {
      nums2[i] = random.nextInt(50) + 1;

      if (max < nums2[i]) {
        max = nums2[i];
      }

      if (min > nums2[i]) {
        min = nums2[i];
      }
    }

    System.out.println(Arrays.toString(nums2));
    System.out.println("Max: " + max + ", Min: " + min);

  }
}
