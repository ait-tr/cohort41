package сast;

public class CastClasses {
    public static void main(String[] args) {

        // примитивы

        int x = 10;

        double y = 10.9;

        double xDouble = x;

        /*
        1 действие - берется значние из пременной x => 10
        2 действие - автоматически преобразует 10 в 10.0
        3 действие - в переменную xDouble помещается значение 10.0
         */


        int yInt = (int) y;

        System.out.println(yInt);

// ----------- с объектами ------

        // вариант 1

        Cat cat = new Cat();
        cat.meow();
        cat.walk();

        Dog dog = new Dog();
        dog.gav();
        dog.walk();


        Animal catAnimal = cat;
        catAnimal.walk();

        Animal dogAnimal = dog;
        dogAnimal.walk();

        Animal[] animals = {catAnimal, dogAnimal};

        //=====================

        Animal cat1 = new Cat();
        Animal dog1 = new Dog();

        cat1.walk();

        Cat cat1Cat = (Cat) cat1;
        cat1Cat.meow();

       // Cat dog1Cat = (Cat) dog1; - ОШИБКА - класс oop.code.Dog не может быть переведен в Cat!!!


      //  dog1Cat.meow();











    }
}
