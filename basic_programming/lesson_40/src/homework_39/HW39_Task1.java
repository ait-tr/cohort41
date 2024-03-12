package homework_39;

import java.util.HashMap;
import java.util.Map;

/*
@date 12.03.2024
@author Sergey Bugaienko
*/
/*
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */

/*
//Output:
Строка: 2
для: 3
проверки: 3
количества: 2
вхождений: 1
слов: 2
и: 2
теста: 1
 */
public class HW39_Task1 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки теста";

        Map<String, Integer> frequencyMap = frequencyDictionary4(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    /*
    1. Мне надо разобрать строку на отдельные слова и поместить в какую-то коллекцию (чтобы иметь возможность перебирать слова)
    2. Нужна карта соответствий слово и количества его вхождений в строку
    3. Перебираем слова.
        3.1. Проверяю - если слово уже есть в карте - обновить значение +1;
        3.2. Если слова нет - добавить новую запись ключ + значение = 1
    4. Вернуть созданную карту

     */
    private static Map<String, Integer> frequencyDictionary(String text) {
        // получаем массив строк
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();
        //Ctrl + ALt + O - оптимизация импортов

        //перебираем слова
        for (String word : words) {
            Integer amount = result.get(word);

            if (amount == null) {
                amount = 0;
            }

            amount = amount + 1;

            result.put(word, amount);
        }

        return result;

    }


    private static Map<String, Integer> frequencyDictionary2(String text) {
        // получаем массив строк
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();
        //Ctrl + ALt + O - оптимизация импортов

        //перебираем слова
        for (String word : words) {

            Integer amount = result.getOrDefault(word, 0);

            result.put(word, ++amount);
        }

        return result;

    }

    private static Map<String, Integer> frequencyDictionary3(String text) {
        // получаем массив строк
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();
        //Ctrl + ALt + O - оптимизация импортов

        //перебираем слова
        for (String word : words) {

            // V (K key, V value) -> функция пересчета нового значения, в качестве аргументов принимает ключ и значение, полученное по этому ключу

            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);

//            result.computeIfPresent(word, (k, v) -> v + 1);
//            result.computeIfAbsent(word, k -> 1);
        }

        return result;

    }

    private static Map<String, Integer> frequencyDictionary4(String text) {
        // получаем массив строк
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();
        //Ctrl + ALt + O - оптимизация импортов

        //перебираем слова
        for (String word : words) {

            // Если get(key) -> вернет null, то будет результат аналогичный вызову метода put(key, value(2-й параметр)
            // Если же ключ существует в карте, то применяется функция объединения значений
            // если результат объединения будет null - то пара из карты будет удалена
            int delta = 1;


            result.merge(word, delta, (oldValue, value) -> {
                System.out.println(word);
//                System.out.println("oldValue: " + oldValue);
//                System.out.println("value: " + value);
                return  null;
            });

        }

        return result;

    }


}
