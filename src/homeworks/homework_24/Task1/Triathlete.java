package homeworks.homework_24.Task1;

/**
 * Triathlete
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Triathlete implements Swimmer, Runner {
  private final String name;


  public Triathlete(String name) {
    this.name = name;
  }


  @Override
  public void run() {
    System.out.println(name + " is running!");
  }


  @Override
  public void swim() {
    System.out.println(name + " is swimming!");
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Triathlete}.
   */
  @Override
  public String toString() {
    return String.format(
        "Triathlete:\n- Name: %s",
        this.name
    );
  }
}
