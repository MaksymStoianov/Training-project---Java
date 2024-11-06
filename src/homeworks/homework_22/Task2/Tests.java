package homeworks.homework_22.Task2;

/**
 * Tests
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Tests {
  public static void main(String[] args) {
    Human human = new Human();
    human.run();
    System.out.println(human);

    Runner runner = new Runner();
    runner.run();
    System.out.println(runner);

    RunnerPro runnerPro = new RunnerPro();
    runnerPro.run();
    System.out.println(runnerPro);
  }
}
