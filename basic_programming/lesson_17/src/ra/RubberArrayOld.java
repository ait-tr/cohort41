package ra;
/*
@date 06.02.2024
@author Sergey Bugaienko
*/

public class RubberArrayOld {

    int[] array;
    int cursor; // присвоено значение по умолчанию 0

    public RubberArrayOld() {
        array = new int[10];
    }

    // Добавлять в массив элемент
    void add(int number) {
        // Добавлять значение в наш массив

        // проверка. Есть ли место в нашем внутреннем массиве?

        if (cursor > array.length * 0.9) {
            expandArray(); // метод расширяющий наш массив
        }

        array[cursor] = number;
        cursor++;
    }

    //Добавлять в массив сразу несколько элементов
    void add(int... ints) {
        // ints - я могу с ним обращаться точно так же как с ссылкой на массив

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }


    // Динамическое изменение размера массива
    void expandArray() {
        System.out.println("Расширяем массив! ================= " + cursor);
        // 1. создать новый массив бОльшего размера
        // 2. Переписать значения из старого массива в новый
        // 3. Перебросить ссылку

        int[] newArray = new int[array.length * 2]; // создаю новый массив, в 2 раза больше предыдущего

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписать значения из старого массива в новый
        }

        array = newArray; // 3. Перебросить ссылку. Переменная array теперь хранит ссылку на "новый" массив
        System.out.println("Расширение массива завершено ==================\n");
    }

    //Вывод в консоль значений массива
    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    // Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    //Возвращение значения по индексу
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return Integer.MIN_VALUE; // хорошего решения на этой стадии нет
            //TODO Поправить потом
        }
    }

}

/*
+ 1. Динамическое изменение размера массива
+ 2. Добавлять в массив элемент
3. Добавлять в массив сразу несколько элементов
+ 4.  Вывод в консоль значений массива
++ Текущее количество элементов в массиве
Возвращение значения по индексу
Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
Поиск элемента по значению
Замена значения по индексу (есть индекс и новое значение)
Замена значения по значению (есть старое и новое значение)
Удаление элемента по индексу
Удаление элемента по значению

 */

/*
В резиновом массиве должны быть реализованы методы:

 */