package homework_36;
/*
@date 06.03.2024
@author Sergey Bugaienko
*/

import java.util.Comparator;

public class Task1Comparator implements Comparator<Integer> {

    // Четные целые числа должны идти перед нечетными числами
    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = (int1 % 2) == 0;
        boolean isSecondEven = (int2 % 2) == 0;

        if (isFirstEven && !isSecondEven) { // первое четное, второе не четное -> первое "меньше" чем второе
            return -1;
        } else if (!isFirstEven && isSecondEven) { // первое нечетное, второе четное -> первое "больше" чем второе
            return 1;
        } else { // оба либо четные, либо не четные
            return Integer.compare(int1, int2);
        }

    }
}
