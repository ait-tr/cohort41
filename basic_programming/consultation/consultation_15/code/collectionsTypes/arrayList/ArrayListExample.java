package code.collectionsTypes.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        System.out.println(listInt);

        for (int i = 1; i < 10; i++) {
            listInt.add(i);
            System.out.println(listInt);
        }

        //===========

        ArrayList<String> listString = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            System.out.println("List length = " + listString.size());
            listString.add("String # " + i);
            System.out.println(listString);
        }


    }
}
