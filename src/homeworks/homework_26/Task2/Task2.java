package homeworks.homework_26.Task2;

import homeworks.homework_25.Task1.MyArrayList;

/**
 * Task2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task2 {

  public static void main(String[] args) {
    MyArrayList<String> names = new MyArrayList<>();
    names.add("Alice");
    names.add("Bob");

    MyArrayList<Integer> scores = new MyArrayList<>();
    scores.add(85);
    scores.add(92);

    printTwoLists(names, scores);
  }


  public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2){

    for (int i = 0; i < list1.size(); i++) {
      System.out.println(list1.getValueByIndex(i));
    }

    for (int i = 0; i < list2.size(); i++) {
      System.out.println(list2.getValueByIndex(i));
    }

  }

}
