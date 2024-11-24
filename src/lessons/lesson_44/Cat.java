package lessons.lesson_44;

import java.util.Objects;

/**
 * Cat
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Cat {
  private String name;
  private int weight;
  private int age;
  private String color;
  private String group;

  public Cat(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public Cat(String name, int weight, int age, String color, String group) {
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = color;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Cat cat = (Cat) o;
    return weight == cat.weight && age == cat.age && Objects.equals(name, cat.name) &&
           Objects.equals(color, cat.color) && Objects.equals(group, cat.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, weight, age, color, group);
  }

  @Override
  public String toString() {
    return "Cat{" +
           "name='" + name + '\'' +
           ", weight=" + weight +
           ", age=" + age +
           ", color='" + color + '\'' +
           ", group='" + group + '\'' +
           '}';
  }
}
