/*
@date 06.02.2024
@author Sergey Bugaienko
*/

public class MainDogs {
    public static void main(String[] args) {

        Dog dog = new Dog("Boss", 7);

        System.out.println(dog.whoAmI());

        dog.run();
        dog.run();
        dog.run();
        dog.run();


        System.out.println(" \n====================== ");
        System.out.println(dog.whoAmI());
    }
}
