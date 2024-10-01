package homework_15;

public class Device {
  protected String brand;
  protected String model;
  protected boolean status;


  public Device(String brand, String model, boolean status) {
    this.brand = brand;
    this.model = model;
    this.status = status;
  }


  /**
   * Включить устройство.
   */
  public void turnOn() {
    this.status = true;
  }


  /**
   * Выключить устройство.
   */
  public void turnOff() {
    this.status = false;
  }


  /**
   * Показать информацию об устройстве.
   */
  public void showDeviceInfo() {
    System.out.println("Устройство: " + brand + " " + model);
  }

}
