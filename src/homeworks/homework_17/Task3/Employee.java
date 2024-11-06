package homeworks.homework_17.Task3;

/**
 * Employee
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Employee {

  private String name;
  private int age;
  private double salary;


  /**
   * Инициализирует класс {@code Employee} со значениями.
   *
   * @param name   Имя работника.
   * @param age    Возраст работника.
   * @param salary Зарплата работника.
   */
  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }


  /**
   * Возвращает имя работника.
   */
  public String getName() {
    return this.name;
  }


  /**
   * Устанавливает имя работника.
   *
   * @param name Имя работника.
   */
  public void setName(String name) {
    if (name == null || name.isEmpty()) return;
    this.name = name;
  }


  /**
   * Возвращает возраст работника.
   */
  public int getAge() {
    return this.age;
  }


  /**
   * Устанавливает возраст работника.
   *
   * @param age Возраст работника.
   */
  public void setAge(int age) {
    if (age < 0) return;
    this.age = age;
  }


  /**
   * Возвращает зарплату работника.
   */
  public double getSalary() {
    return this.salary;
  }


  /**
   * Устанавливает зарплату работника.
   *
   * @param salary Зарплата работника.
   */
  public void setSalary(double salary) {
    this.salary = salary;
  }


  /**
   * Печатает в консоль данные о работнике.
   */
  public void info() {
    System.out.println(this.toString());
  }


  /**
   * Возвращает строковое представление текущего класса.
   *
   * @return Данные о работнике.
   */
  public String toString() {
    return String.format("Employee:\n- Name: %s\n- Age: %d\n- Salary: %.2f", this.name, this.age, this.salary);
  }

}
