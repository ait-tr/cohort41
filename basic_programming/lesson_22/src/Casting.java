/*
@date 14.02.2024
@author Sergey Bugaienko
*/

public class Casting {

    // Восходящее (Upcasting) и нисходящее (Downcasting) преобразование
    public static void main(String[] args) {

        Animal animal = new Hamster(); // здесь тип Hamster автоматически преобразуется к типу Animal.
        Animal animal1 = new Dog(); // Восходящее преобразование обычно происходит не явно
        Animal animal2 = new Cat();

        Cat cat = new Cat();
        cat.eat();

        System.out.println("========== sayHello ========== ");
        sayHello(animal);
        sayHello(cat);
        System.out.println("========== sayHello ========== ");


        Object catObj = new Cat();


        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] instanceof Cat) { // проверяем тип объекта
                System.out.println(animals[i] + " может быть downcasting к Cat");
                Cat catTest = (Cat) animals[i];
                catTest.eat();
            } else {
                System.out.println(animals[i] + " НЕ может быть downcasting к Cat");
            }

            if (animals[i] instanceof Dog) {
                System.out.println(animals[i] + " casting to oop.code.Dog");
                Dog dog = (Dog) animals[i];
                dog.voice();
            } else {
                System.out.println(animals[i] + " в собаку не могу");
            }

            System.out.println(animals[i]);
            animals[i].voice();

            System.out.println("==============");
        }


        System.out.println("\n =========== DownCasting ==============");
        Cat cat1 = (Cat) animal2;
        cat1.voice();
        cat1.eat();

        System.out.println("\n =================== SuperCat ========== \n");

        Animal animalSuper = new SuperCat();


        if (animalSuper instanceof  Cat) {
            Cat cat2 = (Cat)  animalSuper;
            cat2.eat();
        }

        if (animalSuper instanceof SuperCat) {
            SuperCat superCat = (SuperCat) animalSuper;
            superCat.superVoice();
        }


    }

    public static void sayHello(Animal animal) {
        animal.voice();
    }
}
