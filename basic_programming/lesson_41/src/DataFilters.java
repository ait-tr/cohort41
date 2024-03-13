/*
@date 13.03.2024
@author Sergey Bugaienko
*/

import java.util.List;
import java.util.stream.Collectors;

public class DataFilters {
    public static void main(String[] args) {
        /*
        distinct() - удаляет дубликаты. Равенство проверяется по equals()

        limit(long maxSize) - ограничивает количество элементов потока заданным значением
        skip(long n) - Пропускает первые n элементов потока
          */
        aufgabe2();
    }

    private static void aufgabe2() {
        List<Integer> integers = List.of(1, 49, 4, 5, 45, 17, 66, 45, 7);
        //получить три самых маленьких числа из списка

        List<Integer> list = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(list);

        // получить все числа из потока кроме трех самых маленьких
        List<Integer> integerList = integers
                .stream()
                .sorted()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }

    private static void aufgabe1() {
        //получить список с уникальными элементами
        List<Integer> integers = List.of(1, 1, 1, 4, 5, 45, 7, 4, 45, 7);

        integers.stream()
                .distinct()
                .forEach(i -> System.out.println("i: " + i));
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }
}
