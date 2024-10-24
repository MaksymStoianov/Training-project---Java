package homework_22.Task2;

/**
 * Human
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Human {
  private String type = "Человек";
  private final int runSpeed;
  private final int restTime;


  public Human() {
    this("Человек");
  }


  public Human(String type) {
    this.type = type;

    switch (type) {
      case "Спортсмен-профи":
        this.runSpeed = 25;
        this.restTime = 5;
        break;

      case "Спортсмен-любитель":
        this.runSpeed = 15;
        this.restTime = 10;
        break;

      case "Человек":
      default:
        this.runSpeed = 10;
        this.restTime = 15;
        break;
    }
  }


  /**
   * Начать бег.
   */
  public void run() {
    System.out.printf("%s бежит со скоростью %d км/ч.\n", type, runSpeed);
    printRestTime();
  }



  /**
   * Начать восстановление.
   */
  public void printRestTime() {
    System.out.printf("%s нужно для отдыха %d минут.\n", type, restTime);
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о {@code Human}.
   */
  public String toString() {
    return String.format(
        "%s\n- Run speed: %d\n- Rest time: %d",
        this.type,
        this.runSpeed,
        this.restTime
    );
  }
}