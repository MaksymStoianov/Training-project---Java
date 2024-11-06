package lessons.lesson_04.task_02;

public class Cat {
    int age;
    double weight;
    String color;

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Cat(int age, double weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }


    public int getAge() {
        return age;
    }
}
