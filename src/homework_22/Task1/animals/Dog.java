package homework_22.Task1.animals;

/**
 * @author Sergey Bugaenko {@code @date} 11.10.2024
 */

public class Dog extends Animal {


  @Override
  public void voice() {
    // super - обращение к объекту родителя
    super.voice();
  }

  @Override
  public String toString() {
    return super.toString() + " | Dog. Дополнение реализации родительского метода";
  }
}