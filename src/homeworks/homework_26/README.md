## Домашнее задание

### Задача 1
У вас **должен быть** в проекте рабочий вариант обобщенного (с дженериком) класса `MagicArray`.
Мы будем активно пользоваться объектами этого класса. В том числе и при работе над мини-проектом в командах.

### Задача 2
Создайте обобщенный класс `Pair`, который хранит две переменные одного типа.
Требования:
- Класс должен иметь конструктор, принимающий два параметра типа `T`.
- Методы:
    - `T getFirst()` — возвращает первый элемент.
    - `T getSecond()` — возвращает второй элемент.
    - `void setFirst(T value)` — устанавливает значение первого элемента.
    - `void setSecond(T value)` — устанавливает значение второго элемента.
    - `void swap()` — меняет местами первый и второй элементы.

Пример использования:
```java
Pair<String> pair = new Pair<>("Hello", "World");
System.out.println(pair.getFirst()); // Вывод: Hello
System.out.println(pair.getSecond()); // Вывод: World

pair.swap();
System.out.println(pair.getFirst()); // Вывод: World
System.out.println(pair.getSecond()); // Вывод: Hello
```

### Задача 3
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод `printTwoLists`, который принимает два параметра типа `MyArrayList` и `MyArrayList`, и выводит элементы обоих списков.

Требования:
- Метод должен быть обобщенным по двум типам `T` и `U`.
- Элементы списков могут быть разных типов.

Пример использования:
```java
MyArrayList<String> names = new MyArrayList<>();
names.add("Alice");
names.add("Bob");

MyArrayList<Integer> scores = new MyArrayList<>();
scores.add(85);
scores.add(92);

printTwoLists(names, scores);
```

```none
// Вывод:
// Alice
// Bob
// 85
// 92
```

### Задача 4*
Обобщенный класс с ограничениями типов
Описание:
Создайте обобщенный класс `NumericPair`, который хранит две числовые переменные и имеет метод для вычисления их суммы.
Требования:
- Класс должен иметь конструктор для инициализации двух чисел.
    - Метод `double sum()` возвращает сумму этих чисел.

Пример использования:
```java
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
```
