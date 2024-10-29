package homework_31;

/**
 * Season
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public enum Season {
  WINTER (-2, 4),
  SPRING (5, 15),
  SUMMER (15, 25),
  AUTUMN (7, 15);


  private final int min;
  private final int max;


  Season(int min, int max) {
    this.min = min;
    this.max = max;
  }


  /**
   * Возвращает среднюю температуру за сезон.
   *
   * @return int
   */
  public int getAverageTemperature() {
    return ((this.max + this.min) / 2);
  }

}