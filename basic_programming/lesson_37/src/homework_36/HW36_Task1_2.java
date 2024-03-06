package homework_36;
/*
@date 06.03.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;
import java.util.Comparator;

/*
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами

Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
 */
public class HW36_Task1_2 {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

//        Arrays.sort(integers, new Task1Comparator());

        System.out.println(Arrays.toString(integers));


        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n % 2 == 0 ? -1 : 1)
                .thenComparingInt(n -> n)
        );

        System.out.println(Arrays.toString(integers));

        // Task2

        /*
        Четные целые числа должны идти перед нечетными числами в порядке возрастания.
        Нечетные целые числа должны идти после четных в порядке убывания
         */

        Arrays.sort(integers, (int1, int2) -> {
            boolean isFirstEven = (int1 % 2) == 0;
            boolean isSecondEven = (int2 % 2) == 0;

            if (isFirstEven && isSecondEven) { // оба четных. Сравнить в обычном порядке
                return int1 - int2;
            } else if (isFirstEven) { // правое четное, а левое не четное -> значит первое "меньше"
                return -1;
            } else if (isSecondEven) { //левое не четное, правое четное -> левое "больше"
                return 1;
            } else { // оба числа не четные. Сортировать в обратном порядке
                return int2 - int1;
            }
        });

        // 5 -> 7  |||  -7 -> -5

        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, Comparator
                // четные идут налево, нечетные направо
                .<Integer>comparingInt(n -> n % 2 == 0 ? -1 : 1)
                .thenComparingInt(x ->x % 2 == 0 ? x : -x)
        );

        System.out.println(Arrays.toString(integers));


    }
}
