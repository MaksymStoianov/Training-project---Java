package homework_09;

public class Task5 {
  /**
   * Написать метод, который принимает массив строк.
   * Вывести на экран все символы самой длинной строки из массива.
   */
  public static void main(String[] args) {
    String[] array = { "One", "Two", "Twenty" };

    String longestString = array[0];

    for (String str : array) {
      if (str.length() > longestString.length()) {
        longestString = str;
      }
    }

    System.out.println("Символы самой длинной строки \"" + longestString + "\":");
    for (int i = 0; i < longestString.length(); i++) {
      System.out.println(longestString.charAt(i));
    }
  }
}
