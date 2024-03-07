package compareObj.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class PairDemo {
    public static void main(String[] args) {
        Pair[] pairs = new Pair[10];

        pairs[0] = new Pair("три", 3);
        pairs[1] = new Pair("один", 1);
        pairs[2] = new Pair("семь", 7);
        pairs[3] = new Pair("девять", 9);
        pairs[4] = new Pair("пять", 5);
        pairs[5] = new Pair("два", 2);
        pairs[6] = new Pair("восемь", 8);
        pairs[7] = new Pair("шесть", 6);
        pairs[8] = new Pair("десять", 10);
        pairs[9] = new Pair("четыре", 4);

        System.out.println(Arrays.toString(pairs));

        Comparator<Pair> comparator = new PairComparator();

        Arrays.sort(pairs, comparator);

        System.out.println(Arrays.toString(pairs));



    }
}
