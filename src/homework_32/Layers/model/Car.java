package homework_32.Layers.model;

/**
 * Car
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Car {
  private final int id;
  private String model;
  private final int year;
  private double price;
  private boolean isBusy; // значение по умолчанию false


  public Car(int id, String model, int year, double price) {
    this.id = id;
    this.model = model;
    this.year = year;
    this.price = price;
  }

  public int getId() {
    return this.id;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return this.year;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setBusy(boolean busy) {
    this.isBusy = busy;
  }

  public boolean isBusy() {
    return this.isBusy;
  }


  @Override
  public final boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Car)) {
      return false;
    }

    Car car = (Car) o;

    return (this.id == car.id);
  }


  @Override
  public int hashCode() {
    return this.id;
  }


  @Override
  public String toString() {
    return "Car{" +
           "id=" + this.id +
           ", model='" + this.model + '\'' +
           ", year=" + this.year +
           ", price=" + this.price +
           ", isBusy=" + this.isBusy +
           '}';
  }

}
