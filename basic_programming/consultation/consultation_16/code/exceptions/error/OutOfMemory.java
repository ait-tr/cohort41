package code.exceptions.error;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {
        List<String[]> newList = new ArrayList<>();

        int counter = 0;

        while (true) {
            newList.add(newStringArray());
            counter++;

            if (counter % 100 == 0) {
                System.out.println(counter);
            }
        }
    }

    static String[] newStringArray(){
        String[] newArray = new String[1_000_000];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = "zhvjbzskjchvb,dgsahadzghn";
        }
        return newArray;
    }
}
