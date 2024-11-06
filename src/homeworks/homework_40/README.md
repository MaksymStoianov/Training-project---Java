## Домашнее задание

### Задача 1
Напишите метод, принимающий строку и возвращающий **Список** ее слов без повторений, отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке
```Java
public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }    
```

```Java
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
```

### Задача 2
1. Создайте два множества строк (`Set<String>`), каждое из которых будет заполнено различными словами. Некоторые слова должны повторяться в обоих множествах.
2. Реализуйте метод `union(Set<String> set1, Set<String> set2)`, который возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).
3. Реализуйте метод `intersection(Set<String> set1, Set<String> set2)`, который возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
4. Реализуйте метод `difference(Set<String> set1, Set<String> set2)`, который возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).

- Результат каждого метода необходимо выводить в консоль для наглядности.
- Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций.

```Java
Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

System.out.println(SetUtils.union(set1, set2));
System.out.println(SetUtils.intersection(set1, set2));
System.out.println(SetUtils.difference(set1, set2));

// Output:
[A, B, C, D, E, F]
[C, D]
[A, B]
```

### Задача 3*
Написать метод, возвращающий первый неповторяющийся символ в строке
```Java
public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }
    
    //Output:
    e
   
```

### Task 4*
- Создайте два списка. Один на реализации `ArrayList`, второй на `LinkedList`.
- Заполните их `5_000` одинаковыми случайными значениями от `0` до `1_000`.
- Создайте 4 метода, принимающий реализацию интерфейса `List`.
    - В первом методе - получение всех значений элементов списка по индексу (перебрать все индексы, взять значение по текущему индексу)
    - Второй метод - вставка `2_000` новых значений по случайному индексу (диапазон индексов от `0` до размера списка)
    - Третий метод - удалить `1_000` элементов по случайному индексу. (диапазон индексов от `0` до размера коллекции)
    - Удалить `1_000` элементов по значению (диапазон случайных значений от `0` до `10_000`)
- Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
- Сравните для каждого из списка время выполнения каждого метода.
- И сравните время последовательного выполнения всех методов для каждой реализации `List`-а.

### Пример метода, который измеряет время выполнения некоторого кода и возвращает его в миллисекундах:
```java
public class TimerExample {
    public static void main(String[] args) {
        // Измеряем и выводим время выполнения метода someMethod
        long duration = someMethod();
        System.out.println("Время выполнения метода: " + duration + " миллисекунд");
    }

    private static long someMethod() {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
       

        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }
}
```

### Объяснение кода
1. **Метод `someMethod`**:
- В начале метода фиксируем текущее время с помощью `System.currentTimeMillis()`, чтобы определить время начала выполнения (`startTime`).
- В теле метода выполняем нужные операции.
- В конце метода фиксируем текущее время еще раз, чтобы определить время окончания выполнения (`endTime`).
- Возвращаем разницу между временем окончания и началом выполнения, что дает нам время выполнения метода в миллисекундах.