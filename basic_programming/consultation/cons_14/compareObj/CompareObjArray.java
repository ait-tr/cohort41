package compareObj;

import java.util.Arrays;

public class CompareObjArray {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Barsik", 2);
        cats[1] = new Cat("Murzik", 1);
        cats[2] = new Cat("Lastochka", 2);
        cats[3] = new Cat("Lucky", 4);
        cats[4] = new Cat("Tom", 3);

        System.out.println(Arrays.toString(cats));

        Arrays.sort(cats);

        System.out.println(Arrays.toString(cats));


    }
}
