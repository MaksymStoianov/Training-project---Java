package homeworks.homework_43.Task3;

import java.util.Objects;

/**
 * Person
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Person {
  private String name;
  private int age;
  private String city;

  public Person(String name, int age, String city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name) &&
           Objects.equals(city, person.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, city);
  }

  @Override
  public String toString() {
    return "Person{" +
           "name='" + name + '\'' +
           ", age=" + age +
           ", city='" + city + '\'' +
           '}';
  }
}
