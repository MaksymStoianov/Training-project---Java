package homeworks.homework_04.old;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 7);

        int sum = calculator.add();
        System.out.println("Сумма: " + sum);

        int difference = calculator.subtract();
        System.out.println("Разница: " + difference);

        int product = calculator.multiply();
        System.out.println("Произведение: " + product);

        double quotient = calculator.divide();
        System.out.println("Частное: " + quotient);
    }

}
