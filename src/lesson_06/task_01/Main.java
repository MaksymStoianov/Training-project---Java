package lesson_06.task_01;

public class Main {
  public static void main(String[] args) {
    int x = 1;
    String text = "Значение переменной равно ";

    switch (x) {
      case 1:
        System.out.println(text + "одному");
        break;

      case 2:
        System.out.println(text + "двум");
        break;

      case 3:
        System.out.println(text + "треём");

    }
  }
}
