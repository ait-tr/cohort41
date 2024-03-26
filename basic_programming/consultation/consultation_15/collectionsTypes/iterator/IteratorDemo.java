package collectionsTypes.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();

        strings.add("AAA");
        strings.add("GGG");
        strings.add("YYY");
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

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String nextElement = iterator.next();
            if (nextElement.equals("TTT")) iterator.remove();
        }

        //System.out.println(iterator.next());
        System.out.println(strings);

    }
}
