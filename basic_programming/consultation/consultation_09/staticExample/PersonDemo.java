package staticExample;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John");

        person1.setTown("Berlin");
        person1.say();



        Person person2 = new Person("Bill");
        person2.setTown("Leipzig");
        person2.say();

        person1.say();
    }
}
