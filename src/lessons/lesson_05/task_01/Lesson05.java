package lessons.lesson_05.task_01;

public class Lesson05 {

    private static int a = 2;
    public static int b = 5;

    public static void main(String[] args) {
        boolean isValid = a < b && b > 2;
        
        if (isValid) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

}
