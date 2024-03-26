import java.util.Arrays;

public class PeopleApp {
    public static void main(String[] args) {

        Person[] people = new Person[10];

        System.out.println(Arrays.toString(people));

        Schoolchild person1 = new Schoolchild("Petya",12, 6, 4.5);

        Student person2 = new Student("Ruslan", 21, "college # 12");

        Employee person3 = new Employee("Roman", 35,"Apple");


        Schoolchild person4 = new Schoolchild("Olga",16, 10, 4.9);

        Student person5 = new Student("Victor", 20, "college # 12");

        Employee person6 = new Employee("Vasja", 45,"Samsung");

        Schoolchild person7 = new Schoolchild("Oleg",12, 6, 4.0);

        Student person8 = new Student("Anna", 25, "college # 17");

        Employee person9 = new Employee("Georgy", 30,"Google");


        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        people[5] = person6;
        people[6] = person7;
        people[7] = person8;
        people[8] = person9;


        System.out.println(Arrays.toString(people));


        //? задача - мы хотим чтобы ВСЕ эти люди могли разговаривать, НО каждый по своему

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                people[i].say();
            }
        }


        System.out.println("======== ДЕНЬ РОЖДЕНИЯ ОЛЬГИ ======");

        int olgaAge = people[3].getAge();

        System.out.println("Ольге было " + people[3].getAge());
        people[3].setAge(++olgaAge);

        System.out.println();
        System.out.println("Ольге стало " + people[3].getAge());

        Person olga = people[3];

        people[3] = new Student(olga.getName(),olga.getAge(), "college # 1");


        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                people[i].say();
            }
        }



    }
}
