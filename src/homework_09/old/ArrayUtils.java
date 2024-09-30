package homework_09.old;

import java.util.Random;

public class ArrayUtils {

    // Метод, который возвращает массив, заполненный случайными числами
    public static int[] getRandomArray() {

        int[] array = new int[30];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
        }

        return array;
    }

    // Метод, который осуществляет поиск по переданному массиву переданного числа
    // и возвращает индекс ячейки, где это число нашлось
    public static int linearSearch(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }

    // Метод двоичного (бинарного) поиска
    public static int binarySearch(int[] array, int number) {

        // Задаём первоначальный диапазон для поиска нашего значения
        int minIndex = 0;
        int maxIndex = array.length - 1;

        // Вычисляем середину массива (это будет стартовая точка поиска)
        int middleIndex = maxIndex / 2;

        while (true) {

            // Получаем значение, которое находится в середине диапазона поиска
            int current = array[middleIndex];

            if (current == number) {
                return middleIndex;
            } else if (current > number) {
                maxIndex = middleIndex - 1;
            } else {
                minIndex = middleIndex + 1;
            }

            if (minIndex >= maxIndex) {
                return -1;
            }

            middleIndex = (minIndex + maxIndex) / 2;
        }
    }

    // Это тоже линейный поиск, но вместо индекса, где мы нашли число,
    // метод просто возвращает true, то есть метод сообщает нам о
    // факте нахождения числа в массиве, но не о его расположении внутри массива
    public static boolean booleanLinearSearch(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }

        return false;
    }

    // Метод, который сортирует пузырьком переданный массив
    public static void bubbleSort(int[] array) {

        // Переменная, которая говорит нам о том, отсортирован ли массив
        boolean sorted = false;

        while (!sorted) {

            // В начале каждого прохода мы предполагаем,
            // что массив уже отсортирован (для того чтобы
            // закончить работу внешнего цикла, если это
            // действительно будет так
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {

                // Если текущий элемент больше, чем элемент, который
                // находится справа, мы их меняем местами
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Если мы нашли два значения, которые не
                    // отсортированы друг по отношению к другу,
                    // то мы говорим, что наш массив пока ещё не отсортирован
                    sorted = false;
                }
            }
        }
    }
}