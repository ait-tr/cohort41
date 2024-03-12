package collectionsTypes.map.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Person, Dog> map = new HashMap<>();

        map.put(new Person("Ruslan", 30), new Dog("Tuzik", 2));
        map.put(new Person("Viktor", 35), new Dog("Bobik", 3));
        map.put(new Person("Oleg", 20), new Dog("Palkan", 5));

        System.out.println(map);



    }
}
