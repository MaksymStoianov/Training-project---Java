package homeworks.homework_02.old;

public class Main {

    /**
     * Создайте класс Main с методом main и в этом методе создайте трёх котов с разными характеристиками.
     */
    public static void main(String[] args) {
        // Cat 1
        Cat firstCat = new Cat();
        firstCat.age = 3;
        firstCat.weight = 7.5;
        System.out.println(
            "Cat 1:" +
            "\n - Age: " + firstCat.age +
            "\n - Weight: " + firstCat.weight +
            "\n - Number of legs: " + Cat.numberOfLegs
        );

        // Кот должен уметь мяукать в консоль.
//        firstCat.speak();


        Cat secondCat = new Cat();
        secondCat.age = 4;
        secondCat.weight = 8.5;
        System.out.println(
            "Cat 2:" +
            "\n - Age: " + secondCat.age +
            "\n - Weight: " + secondCat.weight +
            "\n - Number of legs: " + Cat.numberOfLegs
        );

        // Кот должен уметь мяукать в консоль.
//        secondCat.speak();


        Cat thirdCat = new Cat();
        thirdCat.age = 5;
        thirdCat.weight = 9.5;
        System.out.println(
            "Cat 3:" +
            "\n - Age: " + thirdCat.age +
            "\n - Weight: " + thirdCat.weight +
            "\n - Number of legs: " + Cat.numberOfLegs
        );

        // Кот должен уметь мяукать в консоль.
//        thirdCat.speak();

    }

}
