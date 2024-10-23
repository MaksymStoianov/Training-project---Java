package homework_19;

/**
 * ImmutablePoint
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class ImmutablePoint {

  final int x;
  final int y;


  public ImmutablePoint(int x, int y) {
    this.x = x;
    this.y = y;
  }


  public void setX(int x) {
    // this.x = x;
    // Error. Cannot assign a value to final variable 'x'
  }


  public void setY(int y) {
    // this.y = y;
    // Error. Cannot assign a value to final variable 'y'
  }


  public int getX() {
    return x;
  }


  public int getY() {
    return y;
  }

}
