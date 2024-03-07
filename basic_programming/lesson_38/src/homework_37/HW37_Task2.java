package homework_37;
/*
@date 07.03.2024
@author Sergey Bugaienko
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Task 2
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */
public class HW37_Task2 {

    private static final int CAPACITY = 50_000;
    private static final int BOUND = 1_000;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {


        List<Integer> listA = new ArrayList<>(CAPACITY);
        List<Integer> listL = new LinkedList<>();


        for (int i = 0; i < CAPACITY; i++) {
            int randomValue = RANDOM.nextInt(BOUND);
            listA.add(randomValue);
            listL.add(randomValue);
        }

        System.out.println(" =============== ArrayList ==================");
        long totalDuration = 0;

        long duration1 =  getAllValuesByIndex(listA);
        totalDuration += duration1;
        System.out.println("getAllValuesByIndex(listA) -> " + duration1);

        long duration2 =  insertValuesByIndex(listA);
        totalDuration += duration2;
        System.out.println("insertValuesByIndex(listA) -> " + duration2);


        long duration3 =  deleteByIndex(listA);
        totalDuration += duration3;
        System.out.println("deleteByIndex(listA) -> " + duration3);


        long duration4 =  deleteByValues(listA);
        totalDuration += duration3;
        System.out.println("deleteByValues(listA) -> " + duration4);

        System.out.println("Total time ArrayList: " + totalDuration);


        System.out.println(" =============== LinkedList ==================");
        totalDuration = 0;

        duration1 =  getAllValuesByIndex(listL);
        totalDuration += duration1;
        System.out.println("getAllValuesByIndex(listL) -> " + duration1);

        duration2 =  insertValuesByIndex(listL);
        totalDuration += duration2;
        System.out.println("insertValuesByIndex(listL) -> " + duration2);


        duration3 =  deleteByIndex(listL);
        totalDuration += duration3;
        System.out.println("deleteByIndex(listL) -> " + duration3);


        duration4 =  deleteByValues(listL);
        totalDuration += duration3;
        System.out.println("deleteByValues(listL) -> " + duration4);

        System.out.println("Total time LinkedList: " + totalDuration);

    }

    public static long getAllValuesByIndex(List<Integer> list) {
        // В первом методе - получение всех значений элементов списка по его индексу
        long start = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static long insertValuesByIndex(List<Integer> list) {
        // Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
        int amountValues = 20_000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < amountValues; i++) {
            list.add(RANDOM.nextInt(list.size()), RANDOM.nextInt(BOUND));
        }
        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static long deleteByIndex(List<Integer> list) {
        //Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
        int amount = 10_000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            list.remove(RANDOM.nextInt(list.size()));
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static long deleteByValues(List<Integer> list) {
        // Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
        int amount = 10_000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            list.remove(Integer.valueOf(RANDOM.nextInt(10_000)));
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

}
