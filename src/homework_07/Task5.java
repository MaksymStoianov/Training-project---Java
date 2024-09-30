package homework_07;

import java.util.Random;

public class Task5 {
  public static void main(String[] args) {
    // Используйте оператор switch для решения задачи:
    // Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.
    Random random = new Random();
    int grade = random.nextInt(13);
    int maxTime = 60;
    int remainingTime = 15;

    // Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

    // Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
    // Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
    // Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
    // Оценка 3 балла: огорчитесь и вычтите 30 минут.
    // Оценка меньше 3 баллов: запретите телевизор на сегодня.

    switch (grade) {
      case 12:
      case 11:
      case 10:
        remainingTime += 60;
        break;

      case 9:
      case 8:
      case 7:
        remainingTime += 45;
        break;

      case 6:
      case 5:
      case 4:
        remainingTime += 15;
        break;

      case 3:
        remainingTime -= 30;
        break;

      default:
        remainingTime = 0;
        break;
    }

    // P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
    if (remainingTime > maxTime) {
      remainingTime = maxTime;
    }

    // Выведите на экран оставшееся время для просмотра ТВ.
    System.out.println("Оценка: " + grade + "\nОставшееся время для просмотра ТВ: " + remainingTime + " минут.");
  }
}
