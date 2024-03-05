/*
@date 05.03.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample {
    public static void main(String[] args) {
        int[] ints = {9, 5, 1, 4, 2, 7, 6, 0};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 300);
        cars[4] = new Car("Ferrari", 2021, 300);

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n=================");

        // Comparable<T>
        // Comparator<T>

        CarSpeedComparator speedComparator = new CarSpeedComparator();

        Arrays.sort(cars, speedComparator);

        System.out.println(Arrays.toString(cars));

//        String[] strings = {"Бббб", "Ссссс", "Bbbbb", "Фффффф", "ббббб"}; // Z < a
        String[] strings = {"Zbbbb1", "Öbbbbbb", "Cccccc2", "Ффффффф", "бббббб", "Сссссс1", "Zbbbb2"}; // Z < a
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));


        Integer[] integers = {4, 6, 2, 34, 1, 0, 9};
        Arrays.sort(integers);

        System.out.println(Arrays.toString(integers));

        //Анонимный класс. Создание безымянного класса реализующего интерфейс Comparator
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        System.out.println("\n===============================\n");

        // Отсортировать массив машин сравнивая скорости машин. Самая медленная = самая маленькая
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car2.getMaxSpeed() - car1.getMaxSpeed();
            }
        });

        System.out.println(Arrays.toString(cars));


        // Функциональный интерфейс - особый тип интерфейса, который имеет ровно один абстрактный метод

        // Лямбда выражения - способ короткой записи анонимный функций (методов)
        // " -> "
        // (parameters) -> expression
        // (parameters) -> { statements; }


        Arrays.sort(cars, (car1, car2) -> car1.getMaxSpeed() - car2.getMaxSpeed());
        System.out.println(Arrays.toString(cars));


        // Сравнит модели по году выпуска. Если год выпуска одинаковый, то сравнить объекты по модели

        Arrays.sort(cars, (car1, car2) -> {
//            int yearCompare = car1.getYear() - car2.getYear();
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());
            if (yearCompare != 0) {
                return yearCompare;
            } else {
                // если года у машин одинаковые, то сравниваем по модели
                return car2.getModel().compareTo(car1.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        Comparator<Car> carComparator = (c1, c2) -> Integer.compare(c1.getYear(), c2.getYear());

        Comparator<Car> carComparator1 = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        };

        Arrays.sort(cars, carComparator);




    }
}
