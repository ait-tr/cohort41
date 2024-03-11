package homework38;
/*
@date 11.03.2024
@author Sergey Bugaienko
*/

import java.util.*;

/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке
 */
public class HW38_Task1 {
    public static void main(String[] args) {

        String testString = "Тестовая   строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords(String testString) {
        /*
        1. Избавиться от знаков препинания (, !, ", ;, :)
        2. Разбить строку на слова (получить массив или список строк)
        3. Поместить слова в какую-то коллекцию, которая обеспечить уникальность (уберет повторы) и сортировку
        4. Вернуть список (если нужно, преобразовать коллекцию в список и вернуть)
         */


        // Избавляемся от дубликатов
        String withoutPunchSymbols = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
//        String withoutPunchSymbols = testString.replaceAll("[\",.!;?]", "");
//        System.out.println(withoutPunchSymbols);

        // Разделяем строку "пробельными символами" и получаем массив строк
        String[] words = withoutPunchSymbols.split("\\s+");
//        System.out.println(Arrays.toString(words));

        // Создаем set, обеспечивающий уникальность и нужный алгоритм сортировки элементов
        Set<String> uniqWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqWords.addAll(Arrays.asList(words));

        //преобразуем множество в список и возвращаем
        return new ArrayList<>(uniqWords);
    }
}
