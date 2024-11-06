package homeworks.homework_27.Task1;

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

    System.out.println(person.setEmail("test@mail.com"));
    System.out.println(person.setEmail("@test@mail.com"));
    System.out.println(person.setEmail("test@mail.co.m"));
    System.out.println(person.setEmail("test@mailcom"));
    System.out.println(person.setEmail("testmail.com"));

    System.out.println(person.getEmail());
  }
}
