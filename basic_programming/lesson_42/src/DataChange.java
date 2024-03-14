/*
@date 14.03.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataChange {
    public static void main(String[] args) {

        // Промежуточные методы для изменения данных (типов) потока

        /*
        map(Function mapper) - преобразует элементы потока с использованием функции-мапера

        flatMap(Function<T, R> mapper) - Преобразует каждый элемент потока в поток других объектов и затем все эти потоки "склеивает" в один поток

        mapToObj(IntFunction mapper) - преобразует примитивный тип данных в ссылочной при помощи заданной функции

        .boxed() - используется для преобразования примитивных данных в соответсвующий оберточный класс
        int -> Integer
        char -> Charter
        double -> Double

        mapToInt - получаем поток примитивов
        mapToLong
        mapToDouble


         */

//        task1();

//        task2();

        task3();
    }

    private static void task3() {
        // Получить список всех символов, содержащихся в строках (String) списка
        String[] strings = {"bAcd", "bbbbb", "string", "hello World"};

        // String.chars() -> IntStream - поток примитивов (int), содержащий целочисленные значения кода символа
        List<Character> characterList = Arrays.stream(strings)
                .flatMapToInt(str -> str.chars())
                .peek(e -> System.out.println("e: " + e))
                .mapToObj(i -> (char) i)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(characterList);


    }

    private static void task4() {
        String[] strings = {"Abcd", "bbbbb", "string", "hello World"};
        // Получить массив int содержащий все длины строк из массива strings
        // int[] arrayInt = {4, 5, 6, 11};

        int[] lengths = Arrays.stream(strings)
                .mapToInt(str -> str.length())
                .toArray();
        System.out.println(Arrays.toString(lengths));

        int[] array = Arrays.stream(strings)
                .map(String::length)
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(array));


    }

    private static void task2() {
        //Примитивы в Stream API
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7};
        //Преобразовать массив примитивов int в список Integer

        List<Integer> integerList = Arrays.stream(ints)
//                .mapToObj(i -> i)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("List: " + integerList);

        //Получить из списка Integer -> массив примитивов
        // IntStream

        int[] ints1 = integerList
                .stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println("массив: " + Arrays.toString(ints1));


    }


    private static void task1() {
        //Получить список всех продуктов, представленных во всех магазинах

        Shop shop = new Shop("Shop1", List.of("Orange", "Banana", "Apple"));
        Shop shop1 = new Shop("Shop2", List.of("Lime", "Cherry", "Pineapple"));
        Shop shop2 = new Shop("Shop3", List.of("Grape", "Lemon", "Apple"));

        Shop[] shops = {shop, shop1, shop2};

        List<String> products = Arrays.stream(shops)
                .flatMap(currentShop -> currentShop.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(products);

    }
}
