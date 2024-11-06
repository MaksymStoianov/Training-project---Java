package homeworks.homework_27.Task2;

import homeworks.homework_27.Person;

/**
 * Test
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Test {
  public static void main(String[] args) {
    Person person = new Person("email", "password");
    System.out.println(person);

    System.out.println(person.setPassword("aA-45678"));
    System.out.println(person.setPassword("aA-4567"));
    System.out.println(person.setPassword("AA-456789"));
    System.out.println(person.setPassword("aa-456789"));
    System.out.println(person.setPassword("aA3456789"));
    System.out.println(person.setPassword("123456789"));

    System.out.println(person.getPassword());
  }
}
