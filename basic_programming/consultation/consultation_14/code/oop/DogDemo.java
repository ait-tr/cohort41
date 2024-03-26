package code.oop;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Tuzik";
        dog1.age = 3;

        System.out.println(dog1);

        dog1.birthday();
    }
}
