package homeworks.homework_15.Task1;

public class Smartphone extends Device {
  protected String color;

  public Smartphone(String brand, String model) {
    super(brand, model, true);
  }

  public Smartphone(String brand, String model, boolean status) {
    super(brand, model, status);
  }

  public Smartphone(String brand, String model, String color) {
    super(brand, model, false);

    this.color = color;
  }

}
