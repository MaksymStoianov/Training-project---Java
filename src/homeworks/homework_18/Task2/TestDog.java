package homeworks.homework_18.Task2;

/**
 * TestDog
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class TestDog {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Max", 500);
    dog1.info();
    int barrierHeight = 750;

    while (true) {
      int result = dog1.jumpBarrier(barrierHeight);

      switch (result) {
        case 0:
          System.out.println("Высота барьера невалидна!");
          return;

        case 1:
          System.out.println("Собака никогда не сможет преодолеть этот барьер, тоска ;(");
          return;

        case 2:
          System.out.println("Собаке нужно подкачаться! Треним ...");
          dog1.train();
        break;

        case 3:
          dog1.jump();
          return;
      }
    }

  }
}
