package collectionsTypes.map.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"Ruslan");
        myMap.put(2,"Viktor");
        myMap.put(3,"Oleg");

        System.out.println(myMap);

        System.out.println(myMap.get(2));

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("Ruslan", 30);
        map2.put("Viktor", 35);
        map2.put("Oleg", 19);

        System.out.println(map2);


    }
}
