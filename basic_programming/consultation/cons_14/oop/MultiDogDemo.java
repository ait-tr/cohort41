package oop;

import java.util.ArrayList;
import java.util.List;

public class MultiDogDemo {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Tuzik", 3, new Breed(1, "Овчарка")));
        dogs.add(new Dog("Bobik", 2,new Breed(2, "Колли")));
        dogs.add(new Dog("Zeus", 3,new Breed(3, "Кане корсо")));
        dogs.add(new Dog("Totoshka", 5,new Breed(4, "Лабрадор")));
        dogs.add(new Dog("Palkan", 7,new Breed(5, "дворняжка")));

        for (int i = 0; i < dogs.size(); i++) {
            dogs.get(i).birthday();
            System.out.println("Кличка собаки: " + dogs.get(i).name);
            System.out.println("Порода собаки: " + dogs.get(i).breed.name);
        }
    }
}
