package collectionsTypes.map.hashCode;

public class HashExample2 {
    public static void main(String[] args) {

        Person person1 = new Person("Ruslan", 25);
        Person person2 = new Person("Ruslan", 25);

        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }
}
