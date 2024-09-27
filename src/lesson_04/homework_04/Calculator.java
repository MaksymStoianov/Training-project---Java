package lesson_04.homework_04;

public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Возвращает сумму двух чисел
    public int add() {
        return number1 + number2;
    }

    // Возвращает разность двух чисел
    public int subtract() {
        return number1 - number2;
    }

    // Возвращает произведение двух чисел
    public int multiply() {
        return number1 * number2;
    }

    // Возвращает частное двух чисел
    public double divide() {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return (double) number1 / number2;
    }

}