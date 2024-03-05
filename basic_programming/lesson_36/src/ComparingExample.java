/*
@date 05.03.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;
import java.util.Comparator;

public class ComparingExample {
    public static void main(String[] args) {
        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 300);
        cars[4] = new Car("Ferrari", 2021, 300);
        cars[5] = new Car("Alfa", 2019, 150);


        //статический метод comparing - возвращает новый компаратор
        // :: -> Ссылка на методы. Позволяет ссылаться на метод без его выполнения
        Comparator<Car> carComparator = Comparator.comparing(Car::getMaxSpeed);
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed));

        // Специализированная версия comparing для сравнения примитивов
        Arrays.sort(cars, Comparator.comparingInt(Car::getMaxSpeed));

        System.out.println(Arrays.toString(cars));
        System.out.println("\n======================\n");

        // обратный порядок сортировки
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed).reversed());
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.reverseOrder()));

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(String::compareTo)));
        System.out.println(Arrays.toString(cars));

        // сравнить по модели, если одинаковая - сравнить по году выпуска

        Comparator<Car> comparator = Comparator
                .comparing(Car::getModel)
                .thenComparing(Car::getYear);

        //Сначала сортируется по модели, если модели совпадают - то выполняется сравнение по году выпуска
        Arrays.sort(cars, comparator);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n===============================\n");

        // Реализовать сортировку машин по убыванию максимальной скорости
        // Если скорости равны - отсортировать по возрастанию года

        Arrays.sort(cars, Comparator
                .comparing(Car::getMaxSpeed)
                .reversed()
                .thenComparing(Car::getYear)
        );
        Arrays.sort(cars, Comparator
                .comparing(Car::getMaxSpeed, Comparator.reverseOrder())
                .thenComparing(Car::getYear)
        );
        System.out.println(Arrays.toString(cars));

        System.out.println("\n==============================\n");

        // Реализовать сортировку по году выпуска, если год совпадает по убыванию максимальной скорости

        Arrays.sort(cars, Comparator
                .comparing(Car::getYear)
                .thenComparing(Car::getMaxSpeed, Comparator.reverseOrder())

        );

        System.out.println(Arrays.toString(cars));

    }
}
