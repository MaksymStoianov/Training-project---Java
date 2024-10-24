package homework_21.Task1;

/**
 * Passenger
 *
 * @author Sergey Bugaenko
 */
public class Passenger {
  private static int counterId;

  private final int id;
  private String name;

  public Passenger(String name) {
    this.name = name;
    this.id = ++counterId;
  }

  public String toString() {
    return "Passenger id: " + id + " name: " + name;
  }


  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}