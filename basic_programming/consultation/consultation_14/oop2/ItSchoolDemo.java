package oop2;

public class ItSchoolDemo {
    public static void main(String[] args) {
        ItSchool itSchool = new ItSchool("IT");

        Group group41 = new Group("Group 41");

        Group group42 = new Group("Group 42");


        Person person1 = new Person("Ruslan", "Ruslan", 32);
        Person person2 = new Person("Robert", "Robert", 30);
        Person person3 = new Person("Bill", "Bill", 27);
        Person person4 = new Person("Oleg", "Oleg", 35);
        Person person5 = new Person("Victor", "Victor", 39);
        Person person6 = new Person("Olga", "Olga", 21);
        Person person7 = new Person("Roman", "Roman", 28);


        Student student1 = new Student(person1, "41");
        Student student2 = new Student(person2, "42");
        Student student3 = new Student(person3, "42");
        Student student4 = new Student(person4, "41");
        Student student5 = new Student(person5, "42");
        Student student6 = new Student(person6, "41");
        Student student7 = new Student(person7, "41");

        group41.addStudent(student1);
        group42.addStudent(student2);
        group42.addStudent(student3);
        group41.addStudent(student4);
        group42.addStudent(student5);
        group41.addStudent(student6);
        group41.addStudent(student7);

        itSchool.addGroup(group41);
        itSchool.addGroup(group42);

        itSchool.printSchoolData();



    }
}
