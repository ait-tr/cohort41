package hw14;
/*
@date 06.02.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;

/*
Написать метод по поиску строки в массиве строк.
На вход метод принимает массив строк, и строку для поиска.
 */
public class HW14_Task3 {

    public static void main(String[] args) {
        String[] strings = {"Java", "Python", null, "Orange", "JS", "hello"};

        int idx = searchString(strings, "Js");
        System.out.println("idx: " + idx);
        if (idx > 0) strings[idx] = "New Value";

        System.out.println(Arrays.toString(strings));

        System.out.println(strings[idx].contains("al"));
        System.out.println(strings[idx].indexOf("al"));
    }


    public static int searchString(String[] strings, String findMe) {
        if (strings == null || findMe == null) return -1;

        for (int i = 0; i < strings.length; i++) {
//            if (strings[i] != null  && strings[i].equals(findMe)) return i; // строгое равенство с учетом регистров
            if (strings[i] != null  && strings[i].equalsIgnoreCase(findMe)) return i; // метод сравнения значений строк без учета регистра
        }

        return -1;
    }
}
