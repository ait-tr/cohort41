
public class DogDemo {
    public static void main(String[] args) {

        int dogAge1 = 2;
        String dogName1 = "Zeus";
        String dogBreed1 = "Cane corso";

        Dog myDog = new Dog();
        myDog.name = "Zeus";
        myDog.age = 2;
        myDog.isHangry = false;


        System.out.println(myDog);

        System.out.println(myDog.name);

        myDog.bark();

        Dog mySecondDog = new Dog();
        mySecondDog.name = "Тотошка";




    }
}
