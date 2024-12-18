## Домашнее задание
### Задача 1
Напишите программу, которая проверяет, являются ли две заданные строки анаграммами (то есть содержат ли они одинаковые буквы в разном порядке).

Инструкции:
- Используйте `HashMap<Character, Integer>` для подсчета количества каждого символа в строках.
- Сравните две карты, чтобы определить, являются ли строки анаграммами.

_P.S. Метод `equals()` для карт в Java сравнивает карты на основе их содержимого — пар ключ-значение — **независимо от порядка ключей**._
_Это означает, что если две карты содержат одинаковые пары ключ-значение, то метод `equals()` вернет `true`, даже если порядок добавления или хранения этих пар различается._

> **Анаграммы** — это слова или фразы, составленные из одних и тех же букв в разном порядке. То есть, две строки являются анаграммами, если они содержат одинаковые символы с одинаковой частотой.

Пример:
- “listen” и “silent” — анаграммы.
- “triangle” и “integral” — анаграммы.
- “apple” и “papel” — анаграммы.
- “hello” и “billion” — не анаграммы.

### Задача 2
Подсчет слов по длине.
Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).

Инструкции:
- Используйте `HashMap<Integer, Integer>`, где ключом является длина слова, а значением — количество слов этой длины.
- Прочитайте текст и обновите карту соответствующим образом.
- Выведите результаты подсчета.

### Задача 3*
Словарь синонимов.
Реализуйте простой словарь синонимов, где каждому слову соответствует список его синонимов.

Инструкции:
- Используйте `HashMap<String, List>` для хранения слов и их синонимов.
- Реализуйте функции для добавления синонимов к слову и получения списка синонимов для заданного слова.
- Предусмотрите возможность обновления и удаления синонимов.

1. Создать класс `SynonymDictionary`, который будет содержать `HashMap<String, List>` для хранения данных.
2. Реализовать методы:
- `addSynonym(String word, String synonym)` — добавляет синоним к слову.
- `getSynonyms(String word)` — возвращает список синонимов для заданного слова.
- `updateSynonyms(String word, List synonyms)` — обновляет список синонимов для слова.
- `removeSynonym(String word, String synonym)` — удаляет синоним из списка синонимов слова.
- `removeWord(String word)` — удаляет слово и все его синонимы из словаря.
