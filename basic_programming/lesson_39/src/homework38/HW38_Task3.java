package homework38;
/*
@date 11.03.2024
@author Sergey Bugaienko
*/


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Написать метод, возвращающий первый неповторяющийся символ в строке
 */
public class HW38_Task3 {
    public static void main(String[] args) {

        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
        System.out.println(getFirstUniqueChar("aaBB"));
    }

    public static Character getFirstUniqueChar(String string) {
        /*
        1. Создаем два set. Один для хранения уникальных символов, второй для хранения повторяющихся символов
            1.1. Set для уникальных элементов должен сохранять порядок добавления элементов
        2. Перебираем строку посимвольно.
        Для каждого символа проверяем
            1. Если символ есть в сете с повторами - переходим у след.символу
            2. Если символ есть в сете уникальных - удалить из уникальных, записать в сет с повторами
            3. Else - Если нет в уникальных - занести в уникальные

        После прохождения по всем символам - взять самый левый (первый) элемент из set-a
         */

        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        //Перебираем символы
        for (char ch : string.toCharArray()) {

            //  Если символ есть в сете с повторами - переходим у след.символу
            if (repeatedChars.contains(ch)) {
                continue; //- переходим у след.символу
            }
            // Есть ли символ есть в сете уникальных
            if (uniqueChars.contains(ch)) {
                uniqueChars.remove(ch);
                repeatedChars.add(ch);
            } else {
                uniqueChars.add(ch);
            }
        }

        System.out.println("RepeatedSet: " + repeatedChars);
        System.out.println("UniqueSet: " + uniqueChars);

        Iterator<Character> iterator = uniqueChars.iterator();

        while (iterator.hasNext()) {
            Character ch = iterator.next();
            System.out.println(ch);
        }



        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();


//        return new LinkedList<Character>(uniqueChars).getFirst();
    }
}
