package hw10;
/*
@date 30.01.2024
@author Sergey Bugaienko
*/

/*
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
 */
public class HW10_Task1 {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        printReverseArray(array);

    } // Methods Area


    public  static void printReverseArray(int[] ints) {
        System.out.print("[");
        for (int i = ints.length - 1; i >= 0 ; i--) {
            System.out.print(ints[i] + ((i > 0) ? ", " : "]\n"));
        }
    }


}
