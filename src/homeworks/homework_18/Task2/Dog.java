package homeworks.homework_18;

import java.util.Random;

/**
 * Dog
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Dog {


  private String name;
  private double initJumpHeight;
  private double jumpHeight;


  /**
   * @param name Имя собаки.
   * @param jumpHeight Высота прыжка (в сантиметрах).
   */
  public Dog(String name, double jumpHeight) {
    this.name = name;
    this.jumpHeight = jumpHeight;
    this.initJumpHeight = jumpHeight;
  }


  /**
   * Возвращает имя собаки.
   * @return Имя собаки.
   */
  public String getName() {
    return this.name;
  }


  /**
   * Собака выполняет прыжок.
   */
  public void jump() {
    System.out.println("Прыжок!");
  }


  /**
   * Собака выполняет тренировку.
   */
  public void train() {
    Random random = new Random();

    // Случайное значение от 1 до 10 (включительно).
    int var1 = random.nextInt(10) + 1;

    if (this.jumpHeight + var1 <= this.initJumpHeight * 2) {
      this.jumpHeight += var1;
    } else {
      this.jumpHeight = this.initJumpHeight * 2;
      // В тренировках большее нет смысла.
    }
  }


  /**
   * Перепрыгнуть барьер.
   *
   * @param barrierHeight Высота барьера (в сантиметрах).
   */
  public int jumpBarrier(int barrierHeight) {
    if (!(barrierHeight > 0)) {
      return 0;
    } else if (barrierHeight > this.initJumpHeight * 2) {
      return 1;
    } else if (barrierHeight > this.jumpHeight) {
      return 2;
    } else {
      return 3;
    }
  }


  /**
   * Печатает в консоль данные о собаке.
   */
  public void info() {
    System.out.println(this.toString());
  }

  /**
   * Возвращает высоту прыжка.
   *
   * @return Высота прыжка.
   */
  public double getJumpHeight() {
    return this.jumpHeight;
  }



  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о собаке.
   */
  public String toString() {
    return String.format("Dog:\n- Name: %s\n- InitJumpHeight: %.2f\n- JumpHeight: %.2f", this.name, this.initJumpHeight, this.jumpHeight);
  }


}
