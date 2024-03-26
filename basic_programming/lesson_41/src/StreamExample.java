/*
@date 12.03.2024
@author Sergey Bugaienko
*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Stream API

        // Stream

        // Промежуточные методы
        /*
        filter(Predicate<T>) - отфильтровывает элементы, соответствующие данному предикату
        sorted() - сортирует элементы
        map(Function <T,R> mapper) - преобразует элементы потока с использованием функции-мапера
        peek(Consumer<T> action) - выполняет действия для каждого элемента потока


        Терминальные методы
        R collect(Collector<T, A, R> collector) - преобразует поток в какую-то структуру данных (например, в Коллекцию)
        void forEach(Consumer<T> action) - выполняет заданное действие для заданного элемента потока
        min(Comparator<T> comparator) - возвращает минимальное значение
        man(Comparator<T> comparator) - максимальное значение


         */

//        task1();

//        code.task2();

//        task3();
//        task4();

//        task5();
//        task6();

//        task7();
//        task8();

//        taskOptional();

//        task9();
//        task10();
        task11();
        task12();

    } // main

    private static void task12() {

        // проверка на null

        Cat[] arrayCats = {
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat(null, 3, "gray"),
                new Cat("Panda", 4, "black"),
                null
        };

        //Получить список котов, вес которых больше 4

        List<Cat> catList = Arrays.stream(arrayCats)
                .filter(cat -> Objects.nonNull(cat)) // отфильтровать null из потока
                .filter(cat -> cat.getWeight() > 4)
                .collect(Collectors.toList());

        System.out.println(catList);

        //отфильтровать поток - убрать всех котов, у которых имя null

        Set<Cat> notNullNameCats = Arrays.stream(arrayCats)
                .filter(Objects::nonNull)
                .filter(cat -> Objects.nonNull(cat.getName()))
                .collect(Collectors.toSet());

        System.out.println(notNullNameCats);


    }

    private static void task11() {
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1, -2, -4);
        // Список всех положительных, четных чисел

        List<Integer> integerList = integers.stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(integerList);


    }

    private static void task10() {
        List<Cat> cats = getListCats();
        // Найти и вывести в консоль самое длинное имя у кота из списка
        // 1. Преобразовать поток в поток имен
        // 2. Максимум (компаратор, который будет сравнивать имена)

        Optional<String> longestName = cats
                .stream()
                .map(Cat::getName)
                .max((name1, name2) -> name1.length() - name2.length());

        if (longestName.isPresent()) {
            System.out.println(longestName.get());
        } else {
            System.out.println("Котов с именами не найдено");
        }

    }

    private static void task9() {
        //распечатать min и max списка чисел
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1);


        Optional<Integer> optMax = integers.stream().max(Integer::compareTo);
        Optional<Integer> optMin = integers.stream().min(Integer::compareTo);

        if (optMax.isPresent()) {
            System.out.println("Max: " + optMax.get());
        } else {
            System.out.println("Max не найден");
        }

        System.out.println("Min: " + optMin.orElseGet(() -> getDefaultValue()));

        System.out.println("Null Optional");

        List<Integer> emptyList = new ArrayList<>();

        Optional<Integer> optMax1 = emptyList.stream().max(Integer::compareTo);
        Optional<Integer> optMin1 = emptyList.stream().min(Integer::compareTo);

        if (optMax1.isPresent()) {
            System.out.println("Max: " + optMax1.get());
        } else {
            System.out.println("Max не найден");
        }

        System.out.println("Min: " + optMin1.orElseGet(() -> getDefaultValue()));

    }

    private static Integer getDefaultValue() {
        return null;
    }

    private static void taskOptional() {
        // Найти минимальное значение в списке чисел
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1);

        Optional<Integer> minOptional = integers.stream().min(Integer::compareTo);

        minOptional = Optional.ofNullable(null);

        System.out.println("minOptional.isEmpty(): " + minOptional.isEmpty());
        System.out.println("minOptional.isPresent(): " + minOptional.isPresent());


        Integer min;
        if (minOptional.isPresent()) {
            min = minOptional.get();
        } else {
            //возвращает значение, если оно присутствует. Иначе возвращает значение по умолчанию
            min = minOptional.orElse(-100);

        }

        System.out.println(min);
        /*

         */

        //Создание Optional
        Optional.empty(); // возвращает пустой Optional
        Optional.of(100); //возвращает Optional сл значением
        Optional.ofNullable(null); // возвращает Optional со значением или пустой

    }

    private static Integer getMax(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) return null;

        Integer max = integers.get(0);
        for (Integer i : integers) {
            if (i > max) max = i;
        }

        return max;
    }

    private static void task8() {
        // Изменить имя котов, вес которых меньше 5.
        // Распечатать элементы потока
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats
                .stream()
                .filter(cat -> cat.getWeight() < 5) // фильтруем поток
                .peek(cat -> cat.setName("Slim " + cat.getName()));
//                .map(cat -> null); // промежуточный метод, который совершает какое-то действия с каждым элементом потока

        catStream.forEach(cat -> System.out.println(cat)); // терминальный метод, который совершает какое-то действия с каждым элементом потока

        System.out.println("cats: " + cats);

    }

    private static void task7() {

        // Stream API и исключения
        // Если в каком-либо промежуточном методе возникает исключительная ситуация,
        // то обработать ее (словить) мы можем только в терминальном методе этого потока (а не в методе, который вызвал исключение)


        Cat[] arrayCats = {
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat(null, 3, "gray"),
                new Cat("Panda", 4, "black")
        };

        // Создание потока из массива
        Stream<Cat> stream = Arrays.stream(arrayCats);


        stream = stream.filter(cat -> cat.getName().length() > 4);


        try {
            List<Cat> catList = stream.collect(Collectors.toList());
            System.out.println("Method try");
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }

        System.out.println("End method");


    }

    private static void task6() {
        //Получить список имен, которые короче 5 символов

        List<Cat> cats = getListCats();

        List<String> names = cats
                .stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        List<String> strings = cats
                .stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(names);
    }


    private static void task5() {
        // Получить список имен кошек, чей вес больше 4
        List<Cat> cats = getListCats();

        // 1 Оставить кошек, чей вес больше 4 кг
        // 2. Преобразовать кошек в имена
        // 3. Собрать поток в список

        List<String> catNames = cats
                .stream()
                .filter(cat -> cat.getWeight() > 4)
//                .map(cat -> cat.getName())
                .map(Cat::getName)
                .collect(Collectors.toList());


        System.out.println(catNames);

    }

    private static void task4() {
        // получить список имен всех кошечек
        List<Cat> cats = getListCats();

        Stream<String> stringStream = cats
                .stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats
                .stream() // создаем поток
                .map(Cat::getName) // преобразуем Stream<Cat> -> Stream<String>
                .collect(Collectors.toList()); // собираем в список

        System.out.println(catNames);


    }

    private static void task3() {
        List<Cat> cats = getListCats();

        // фильтрация по длине имени.
        // Список котов, чье имя длиннее 4 символов

        Stream<Cat> catStream = cats
                .stream()
                .filter(cat -> cat.getName().length() > 4);

        catStream = catStream.filter(cat -> cat.getWeight() < 4);

        // пока не запущен терминальный метод, промежуточные методы не выполняются
        // Lazy Evaluation
        List<Cat> catList = catStream.collect(Collectors.toList());


        System.out.println("End task3 method");

        //
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        //список кошек, чей вес больше 4 кг

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод закрывает поток.
        List<Cat> fatCats = catStream.collect(Collectors.toList());

        // повторно использовать "закрытый" поток нельзя.
//        List<Cat> cats1 = catStream.filter(cat -> cat.getWeight() > 6);

        System.out.println(fatCats);

    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 0);
        // список, положительных чисел
        // список должен быть отсортирован в порядке возрастания

//        List<Integer> result = new ArrayList<>();
//        for (Integer intg : integers) {
//            if (intg > 0 ) result.add(intg);
//        }
//        Collections.sort(result);
//        System.out.println(result);

        // У всех коллекций, есть метод stream() - создающий поток на основе элементов коллекции

        List<Integer> resultStream = integers.stream()   // создаю поток на основе коллекции
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer > 0;
//                    }
//                })
                .filter(integer -> integer > 0) // фильтрация элементов
                .sorted() //сортировка в естественном порядке
                .collect(Collectors.toList()); // преобразует элементы потока в список (в коллекцию)

        System.out.println(resultStream);

    }


}
