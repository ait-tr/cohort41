package hw5;
/*
@date 23.01.2024
@author Sergey Bugaienko
*/

import java.util.Random;

/*
Создайте переменную типа int.
Инициализируйте переменную произвольным значением
Выведите строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
 0 - не считать четным, не считать кратным 3
 */
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int rand = random.nextInt(11); // [0..11) -> [0..10]

        //rand = 0;

        // четное -> число, которое делится на 2 без остатка. Т.е. остаток равен 0
        boolean isEven = (rand != 0) & (rand % 2 == 0);
        boolean isDevByThree = rand != 0 & rand % 3 == 0; // при делении числа на 3 остаток равен 0
        boolean isTwice = isEven & isDevByThree;

        System.out.printf("Число: %d четное: %s; кратно 3: %s; четное и кратное 3: %s\n", rand, isEven, isDevByThree, isTwice);

    }
}
