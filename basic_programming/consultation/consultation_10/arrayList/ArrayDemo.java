package arrayList;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] strings = new String[10];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "word # " + i;
        }

        System.out.println(Arrays.toString(strings));

        //strings[???] = "word # 10";

        strings[4] = null;

        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                strings[i] = "word # 10";
                break;
            }
        }

        System.out.println(Arrays.toString(strings));

       arrayElementRemove(strings, "word # 10");


    }

    private static void arrayElementRemove(String[] array, String element){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                array[i] = null;
            }
        }

        System.out.println(Arrays.toString(array));

        arraySort(array);


        System.out.println(Arrays.toString(array));



    }

    private static void arraySort(String[] array){
        for (int i = 0; i < array.length; i++) {
            String min = array[i];
            int minId = i;

            for (int j = i + 1; j < array.length; j++) {

                if (compareString(array[j],min) < 0) {
                    min = array[j];
                    minId = j;
                }
            }

            String temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    private static int compareString(String a, String b){
        if (a == null && b == null) return 0;
        if (a == null) return 1;
        if (b == null) return -1;
        return a.compareTo(b);
    }

}
