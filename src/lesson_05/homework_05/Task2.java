package lesson_05.homework_05;

public class Task2 {
  public static void main(String[] args) {
    // Создайте строки:
    String str1 = "Java";
    String str2 = "is";
    String str3 = "a";
    String str4 = "powerful";
    String str5 = "language";

    // Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
    // Выведите на экран получившуюся строку и её длину.

    String result1 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
    System.out.println("\"" + result1 + "\" - length = " + result1.length());

    String space = " ";
    String result2 = ""
        .concat(str1).concat(space)
        .concat(str2).concat(space)
        .concat(str3).concat(space)
        .concat(str4).concat(space)
        .concat(str5);

    System.out.println("\"" + result2 + "\" - length = " + result2.length());

    // Task 2.2 * (Опционально)
    // Замените в результирующей строке слово "powerful" на "super".
    System.out.println(result2.replace("powerful", "super"));

    // Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
    boolean hasAge = result2.contains("age");
    System.out.println("Строка \"" + result2 + "\" " + (hasAge ? "" : "не ") + "содержит подстроку \"age\".");
  }
}
