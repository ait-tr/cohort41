package staticExample;

public class Person {

    String name;
    static String town;
    static final String country = "Germany";

    public Person(String name) {
        this.name = name;
    }

    public static void setTown(String town) {
        Person.town = town;
    }

    public void say(){
        System.out.println("Hello! My name is " + name);
        System.out.println("I am from " + town + "(" + country + ")");
    }
}
