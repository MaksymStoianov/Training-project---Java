package homework_26.Task1;

/**
 * Pair
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Pair<T> {
  private T firstVar;
  private T secondVar;


  public Pair(T firstVar, T secondVar) {
    this.firstVar = firstVar;
    this.secondVar = secondVar;
  }


  T getFirst() {
    return this.firstVar;
  }


  T getSecond() {
    return this.secondVar;
  }


  void setFirst(T value) {
    this.firstVar = value;
  }


  void setSecond(T value) {
    this.secondVar = value;
  }


  void swap() {
    T temp = this.firstVar;
    this.firstVar = this.secondVar;
    this.secondVar = temp;
  }


  @Override
  public String toString() {
    return "Pair{" +
           "first = " + this.firstVar +
           ", second = " + this.secondVar +
           '}';
  }

}
