package collectionsTypes.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Person> mySet = new HashSet<>();

        Person person1 = new Person("Ruslan", 30);
        Person person2 = new Person("Ruslan", 35);
        Person person3 = new Person("Viktor", 30);


        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        mySet.add(person1);
        mySet.add(person2);
        mySet.add(person3);


        System.out.println(mySet);
    }
}
