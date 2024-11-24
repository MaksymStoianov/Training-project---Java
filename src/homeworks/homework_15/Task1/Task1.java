package homeworks.homework_15.Task1;

public class Task1 {
  /**
   * Посмотрите вокруг себя.
   * Напишите три класса, описывающие какие-то сущности вокруг Вас.
   *
   * Не забудьте использовать абстракцию.
   *
   * Например, опишите студента, преподавателя и, допустим, врача.
   *
   * Вы можете выбрать свои сущности для описания.
   */
  public static void main(String[] args) {
    Computer myComputer = new Computer("Apple", "MacBook", 50, 16);
    Smartphone mySmartphone = new Smartphone("Nitrokey", "NitroPhone 5");

    myComputer.showDeviceInfo();
    myComputer.turnOn();

    mySmartphone.showDeviceInfo();
    mySmartphone.turnOff();
  }
}
