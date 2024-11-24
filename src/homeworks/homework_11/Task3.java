package homeworks.homework_11;

public class Task3 {

  public static void main(String[] args) {
    // Пример массивов
    int[] array1 = {1, 2, 3, 2, 1};
    int[] array2 = {1, 2, 3, 4, 5};

    // Проверка и вывод результатов
    System.out.println("Массив 1 палиндром? " + isPalindrome(array1));
    System.out.println("Массив 2 палиндром? " + isPalindrome(array2));
  }


  public static boolean isPalindrome(int[] array) {
    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      if (array[left] != array[right]) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }

}
