package oop;

public class Dog {
    String name;
    int age;
    Breed breed;

    public Dog() {
    }

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void birthday(){
        age = age + 1;
        // age++;
        System.out.println("У моей собаки сегодня день рождения!");
        System.out.println("Age = " + age);
    }


    @Override
    public String toString() {
        return "code.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}
