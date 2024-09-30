package homework_10;

public class Task2 {

  /**
   * Написать метод, принимающий на вход массив строк.
   * Метод должен вернуть массив, состоящий из самой
   * короткой и самой длинной строки изначального массива.
   */

  public static void main(String[] args) {


    String[] array = {"Blue", "Red", "Green"};
    String[] result = find(array);

    System.out.println("Самая короткая строка: " + result[0]);
    System.out.println("Самая длинная строка: " + result[1]);
  }



  public static String[] find(String[] strings) {
    String shortest = strings[0];
    String longest = strings[0];

    for (String str : strings) {
      if (str.length() < shortest.length()) {
        shortest = str;
      }

      if (str.length() > longest.length()) {
        longest = str;
      }
    }

    return new String[]{shortest, longest};
  }
}
