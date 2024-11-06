## Домашнее задание

### Задача 1
Воспроизвести код, написанный на уроке.

### Задача 2
Компьютер и компоненты
1. Создайте базовый класс `Component` с полями `brand` (бренд) и `model` (модель).
2. Создайте производные классы: `Processor`, `Memory`, `Storage` от класса `Component`.
3. Создайте класс `Computer` который будет содержать компоненты: процессор, память и накопитель.
4. Реализуйте отношения между `Computer` и компонентами. Компоненты `Processor` и `Memory` не могу существовать без компьютера.

### Задача 3*
Переписать метод `public String toString()`в классе Autobus, используя `StringBuilder` для формирования строки.
```java
 public String toString() {
	// TODO переписать, используя StringBuilder
	return "Autobus: {id: " + id +  "; capacity:" + capacity +
			"; driver: " + driver.toString() +
			"; autopilot: " + autopilot.toString() + " }" ;
}
```

### Задача 4*
Написать метод высадки пассажира из автобуса `boolean dropPassenger(Passenger passenger)`.
