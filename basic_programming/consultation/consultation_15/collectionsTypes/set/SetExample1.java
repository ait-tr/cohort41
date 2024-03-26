package collectionsTypes.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        List<String> ourStringList = new ArrayList<>();
        ourStringList.add("I");
        ourStringList.add("love");
        ourStringList.add("Java");
        ourStringList.add("I");
        ourStringList.add("love");
        ourStringList.add("coffee");
        ourStringList.add("Java");
        ourStringList.add("island");
        ourStringList.add("coffee");

        System.out.println(ourStringList);

        List<String> uniqList = new ArrayList<>();

        for (int i = 0; i < ourStringList.size(); i++) {
            if (!uniqList.contains(ourStringList.get(i))) {
                uniqList.add(ourStringList.get(i));
            }
        }

        System.out.println(uniqList);


        Set<String> uniqSet = new HashSet<>(ourStringList);
        System.out.println(uniqSet);

        Set<String> uniqSet2 = new HashSet<>();

        for (int i = 0; i < ourStringList.size(); i++) {
            uniqSet2.add(ourStringList.get(i));
        }

        System.out.println(uniqSet2);
    }

}
