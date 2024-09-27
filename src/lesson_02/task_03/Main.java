package lesson_02.task_03;

public class Main {
    public static void main(String[] args) {
        int number;
        number = 7;
        System.out.println(number);

        Student firstStudent;
        firstStudent = new Student();
        firstStudent.age = 25;
        System.out.println(firstStudent.age);

        Student secondStudent = new Student();
        secondStudent.age = 35;
        System.out.println(secondStudent.age);

        Student thirdStudent = new Student();
        thirdStudent.age = 45;
        System.out.println(thirdStudent.age);

        firstStudent.study();
        secondStudent.study();
        thirdStudent.study();
    }
}
