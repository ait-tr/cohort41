/*
@date 12.03.2024
@author Sergey Bugaienko
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {
    public static void main(String[] args) {
        // Consumer<T> - выполняет операцию над объектом типа T. Не возвращает никакого результат
        //void accept(T t)

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        Consumer<String> printConsumer = t -> System.out.println(t + "!!!");
        printConsumer.accept("Hello World");

        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = str -> System.out.println("2. " + str + "!");
        // составной Consumer
        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        // boolean Predicate<T> - простая функция, которая принимает объект типа T и возвращает булевое значение
        // Этот интерфейс особенно полезен для проверки соответсвия элемента неким условиям (фильтрация)
        // boolean test(T t) - основной метод
        // or
        //and
        //negate () - инверсия

        Predicate<String> testPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        boolean result = isNotEmpty.test("Hello, World");
        System.out.println(result);


        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 0, 34, -45, 11, 45));

        // список отрицательных
        List<Integer> res1 = geListByPredicate(list, i -> i < 0);
        System.out.println(res1);

        List<Integer> res2 = geListByPredicate(list, i -> i % 2 == 0);
        System.out.println(res2);

        Predicate<String> isContainsJava = str -> str.contains("Java");

        Predicate<String> combinePredicate = isNotEmpty.and(isContainsJava);
        Predicate<String> combinePredicate2 = isContainsJava.negate();

        System.out.println(combinePredicate2.test("4343Java"));


        // Function<T,R>  - операция над объектом типа T возвращающая результат типа R
        //R apply(T t);
        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return null;
            }
        };

        Function<String, Integer> function = str -> str.length();
        int length = function.apply("Hello, world!");
        System.out.println("length: " + length);

        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> concatenate = s -> s + "!!!";
        Function<String, String> combinedFunc = toUpperCase.andThen(concatenate);

        String result1 = combinedFunc.apply("Hello");
        System.out.println(result1);




    }

    public static List<Integer> geListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : integers) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }

        return result;
    }
}
