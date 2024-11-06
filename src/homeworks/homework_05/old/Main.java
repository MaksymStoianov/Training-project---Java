package homeworks.homework_05.old;

public class Main {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;

        boolean result = canWalk(isWeekend, isRain);
        System.out.println("Гулять " + (result ? "можно" : "нельзя") + "!");


        // Задаем длины сторон треугольника
        int side1 = 3;
        int side2 = 3;
        int side3 = 5;

        String triangleType = getTriangleType(side1, side2, side3);
        System.out.println("Тип треугольника: " + triangleType);
    }

    public static boolean canWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
    }

    public static String getTriangleType(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            return "равносторонний";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "равнобедренный";
        } else {
            return "разносторонний";
        }
    }
}
