package homeworks.homework_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Task2
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task2 {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2024, 11, 20),
                LocalDate.of(2024, 11, 10),
                LocalDate.of(2024, 11, 25),
                LocalDate.of(2024, 11, 15)
        );

        long daysBetween = calculateDaysBetween(dates);
        System.out.println("Количество дней между самой ранней и самой поздней датами: " + daysBetween);
    }


    public static long calculateDaysBetween(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не может быть пустым.");
        }

        LocalDate earliestDate = dates
                .stream()
                .min(LocalDate::compareTo)
                .orElseThrow();

        LocalDate latestDate = dates
                .stream()
                .max(LocalDate::compareTo)
                .orElseThrow();

        return ChronoUnit.DAYS.between(earliestDate, latestDate);
    }
}
