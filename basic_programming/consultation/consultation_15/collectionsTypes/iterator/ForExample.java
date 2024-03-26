package collectionsTypes.iterator;

import java.util.ArrayList;
import java.util.List;

public class ForExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("AAA");
        strings.add("GGG");
        strings.add("RRR");
        strings.add("EEE");
        strings.add("WWW");
        strings.add("AAA");
        strings.add("MMM");
        strings.add("TTT");
        strings.add("SSS");
        strings.add("FFF");
        strings.add("HHH");
        strings.add("CCC");

        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
            if (strings.get(i).equals("HHH")) {strings.remove(i);}
        }


        System.out.println(strings);
    }
}
