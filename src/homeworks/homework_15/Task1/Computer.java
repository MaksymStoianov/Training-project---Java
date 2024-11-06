package homeworks.homework_15;

public class Computer extends Device {
  // Размер оперативной памяти (в ГБ)
  private int ramSize;

  // Размер оперативной памяти (в ГБ)
  private int ssdSize;

  public Computer(String brand, String model, int ramSize) {
    super(brand, model, false);

    this.ramSize = ramSize;
  }

  public Computer(String brand, String model, int ramSize, int ssdSize) {
    super(brand, model, false);

    this.ramSize = ramSize;
    this.ssdSize = ssdSize;
  }

}
