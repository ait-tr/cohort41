package code.collectionsTypes.map.hashCode;

public class HashExample3 {
    public static void main(String[] args) {

        Person person1 = new Person("Ruslan", 25);
        Person person2 = new Person("Ruslan", 30);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person1.equals(person2));

    }
}
