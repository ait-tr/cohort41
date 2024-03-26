package code.compareObj.comparable;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int[] ints = {6,3,8,1,4,9,2,5,7};

        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));


        String[] strings = {"b","d","e","a","c","g","f"};
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));


    }
}
