package lesson_02.homework_02;

public class Cat {

    // В классе также должна быть переменная, определяющая количество лап у кота. Эта переменная должна принадлежать не конкретному объекту кота, а классу.
    static int numberOfLegs = 4;

    // У кота должен быть возраст (целочисленный).
    int age;

    // У кота должен быть вес (дробные значения, используйте тип double).
    double weight;

    // Кот должен уметь мяукать в консоль. То есть в классе Кот должен быть метод, который выводит в консоль "Мяу!".
    public void speak() {
        System.out.println("Мяу!");
    }

}
