package homework_26.Task3;

/**
 * NumericPair
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class NumericPair <T extends Number, E extends Number> {
  private final T var1;
  private final E var2;


  public NumericPair(T var1, E var2) {
    this.var1 = var1;
    this.var2 = var2;
  }


  public Double sum() {
    return (this.var1.doubleValue() + this.var2.doubleValue());
  }

}
