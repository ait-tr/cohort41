package collectionsTypes.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("A");
        mySet.add("A");
        mySet.add("B");
        mySet.add("A");
        mySet.add("B");
        mySet.add("C");
        mySet.add("D");
        mySet.add("A");
        mySet.add("D");
        mySet.add("E");
        mySet.add("A");
        mySet.add("F");

        System.out.println(mySet);
    }
}
