package homework_03;

import java.util.Arrays;

public class HomeWork03 {
  public static void main(String[] args) {
    /*
     * Task 1
     */
    System.out.println("Task 1");

    // Переменная 1 - сколько Вам полных лет
    int age = 32;

    // Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
    double costMilk = 3.141592653589793;

    // Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных хранить можно хранить текст. (Гугл?))
    String name = "Max";
    System.out.println(
        "age: " + age +
            "\ncostMilk: " + costMilk +
            "\nname: " + name
    );


    /*
     * Task 2
     */
    System.out.println("\nTask 2");

    // Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
    int var1 = 0;
    int var2 = 1;
    int var3 = 2;
    int var4 = 3;

    // Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
    int result1 = (var1 + var2 + var3 + var4) / 4;

    // Выведите на экран значение переменной.
    System.out.println("result:" + result1);

    // Сколько программа отбросила в дробной части?
    double result2 = (double) (var1 + var2 + var3 + var4) / 4;
    System.out.println("fractional part:" + (result2 - result1));


    /*
     * Task 3 * (Опционально)
     */
    System.out.println("\nTask 3");

    // Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.
    // Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
    int product1Price = 1000;
    int product2Price = 500;
    int discount = 10;


    // Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
    int sumWithoutDiscount = (product1Price + product2Price);
    double discountAmount = (double) sumWithoutDiscount * discount / 100;
    double result3 = sumWithoutDiscount - discountAmount;
    System.out.println("sum: " + result3);

    // Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
    System.out.println("discountAmount: " + discountAmount);


    /*
     * Task 4 * (Опционально)
     */

    System.out.println("\nTask 4");

    // Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

    // Вычислите среднюю температуру за неделю и выведете ее на печать.
    int[] array = {27, 28, 29, 25, 26, 27, 28};
    int sum = Arrays.stream(array).sum();
    double result4 = (double) sum / array.length;
    System.out.println("result: " + result4);
    

    /*
     * Task 5. Теоретический
     */
    System.out.println("\nTask 5");

    // Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?

    System.out.println("2 % 2 = 0 - четные\n1 % 2 = 1 - нечетные\n");
    System.out.println("3 % 3 = 0 - делится на 3 без остатка\n2 % 3 = остаток "+(2 % 3)+"\n1 % 3 = остаток "+(1 % 3));
  }
}
