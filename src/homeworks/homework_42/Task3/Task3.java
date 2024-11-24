package homeworks.homework_42.Task3;

import java.util.*;

/**
 * Task3
 *
 * @author <a href="stoianov.maksym@gmail.com">Maksym Stoianov</a>
 */
public class Task3 {
    public static void main(String[] args) {
        Task3 dictionary = new Task3();

        dictionary.addSynonym("привет", "здравствуй");
        dictionary.addSynonym("привет", "добрый день");
        dictionary.addSynonym("привет", "день добрый");
        dictionary.addSynonym("привет", "салют");

        System.out.println("Синонимы слова 'привет': " + dictionary.getSynonyms("привет"));

        dictionary.updateSynonyms("привет", Arrays.asList("привет", "хай", "здравствуй"));
        System.out.println("Обновленные синонимы слова 'привет': " + dictionary.getSynonyms("привет"));

        dictionary.removeSynonym("привет", "хай");
        System.out.println("Синонимы слова 'привет' после удаления: " + dictionary.getSynonyms("привет"));

        System.out.println("Словарь синонимов:");
        dictionary.displayDictionary();
    }

    private final Map<String, List<String>> synonymsMap;

    public Task3() {
        this.synonymsMap = new HashMap<>();
    }

    /**
     * Добавляет синоним к слову.
     *
     * @param word    слово
     * @param synonym синоним
     */
    public void addSynonym(String word, String synonym) {
        synonymsMap.putIfAbsent(word, new ArrayList<>());
        List<String> synonyms = synonymsMap.get(word);

        if (!synonyms.contains(synonym)) {
            synonyms.add(synonym);
        }
    }

    /**
     * Возвращает список синонимов для заданного слова.
     *
     * @param word слово
     * @return список синонимов
     */
    public List<String> getSynonyms(String word) {
        return synonymsMap.getOrDefault(word, new ArrayList<>());
    }

    /**
     * Обновляет список синонимов.
     *
     * @param word     слово
     * @param synonyms новый список синонимов
     */
    public void updateSynonyms(String word, List<String> synonyms) {
        synonymsMap.put(word, new ArrayList<>(synonyms));
    }

    /**
     * Удаляет синоним.
     *
     * @param word    слово
     * @param synonym синоним
     */
    public void removeSynonym(String word, String synonym) {
        List<String> synonyms = synonymsMap.get(word);

        if (synonyms != null) {
            synonyms.remove(synonym);
            if (synonyms.isEmpty()) {
                synonymsMap.remove(word); // Удаляем слово, если больше нет синонимов
            }
        }
    }

    /**
     * Удаляет слово и его синонимы.
     *
     * @param word слово
     */
    public void removeWord(String word) {
        synonymsMap.remove(word);
    }

    /**
     * Печатает весь словарь.
     */
    public void displayDictionary() {
        synonymsMap.forEach((word, synonyms) ->
                System.out.println(word + ": " + String.join(", ", synonyms)));
    }
}