package lesson_03.homework_03;

public class Main {
    public static void main(String[] args) {
        byte exampleByte = 127;
        System.out.println("byte: " + exampleByte);

        short exampleShort = 32767;
        System.out.println("short: " + exampleShort);

        int exampleInt = 2147483647;
        System.out.println("int: " + exampleInt);

        long exampleLong = 9223372036854775807L;
        System.out.println("long: " + exampleLong);

        float exampleFloat = 3.14F;
        System.out.println("float: " + exampleFloat);

        double exampleDouble = 3.141592653589793;
        System.out.println("double: " + exampleDouble);

        char exampleChar = 'A';
        System.out.println("char: " + exampleChar);

        boolean exampleBoolean = true;
        System.out.println("boolean: " + exampleBoolean);

        /* Преобразование числа 456 из восьмеричной системы в десятичную
         * 4*8^2 + 5*8^1 + 6*8^0 = 4×64 + 5×8 + 6×1 = 256 + 40 + 6 = 302
         */

        /* Преобразование числа 302 из десятичной системы в двоичную
         * 302 / 2 = 151 остаток 0
         * 151 / 2 = 75 остаток 1
         * 75 / 2 = 37 остаток 1
         * 37 / 2 = 18 остаток 1
         * 18 / 2 = 9 остаток 0
         * 9 / 2 = 4 остаток 1
         * 4 / 2 = 2 остаток 0
         * 2 / 2 = 1 остаток 0
         * 1 / 2 = 0 остаток 1
         * Собираем остатки в обратном порядке:
         * 100101110
         */

        /* Преобразование числа 302 из десятичной системы в шестнадцатеричную
         * 302 / 16 = 18 и остаток 12 (E)
         * 18 / 16 = 1 и остаток 2
         * 1 / 16 = 0 и остаток 1
         * Собираем остатки в обратном порядке:
         * 12E
         */
    }
}
