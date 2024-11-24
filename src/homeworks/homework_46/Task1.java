package homeworks.homework_46;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * Task1
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("\nТекущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);

        LocalDate birthday = LocalDate.of(1992, Month.FEBRUARY, 20);
        System.out.println("\nДата дня рождения: " + birthday);

        LocalDate date1 = LocalDate.of(2024, Month.NOVEMBER, 21);
        LocalDate date2 = LocalDate.of(2024, Month.NOVEMBER, 21);
        System.out.println("\nДаты равны: " + date1.equals(date2));

        LocalTime currentTime = LocalTime.now();
        System.out.println("\nТекущее время: " + currentTime);

        LocalTime timePlus3Hours = currentTime.plusHours(3);
        System.out.println("\nТекущее время + 3 часа: " + timePlus3Hours);

        LocalDate nextWeek = currentDate.plusWeeks(1);
        System.out.println("\nДата через неделю: " + nextWeek);

        LocalDate lastYear = currentDate.minusYears(1);
        System.out.println("\nДата на год раньше: " + lastYear);

        LocalDate nextYear = currentDate.plusYears(1);
        System.out.println("\nДата на год позже: " + nextYear);

        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);

        System.out.println("\nЗавтра: " + tomorrow);
        System.out.println("Вчера: " + yesterday);

        System.out.println("\nЗавтра после сегодняшней: " + tomorrow.isAfter(currentDate));
        System.out.println("Вчера до сегодняшней: " + yesterday.isBefore(currentDate));
    }
}
