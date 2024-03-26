package collectionsTypes.arrayList;

import java.util.ArrayList;

public class PersonDataBaseArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Ruslan", 29, 1234556677));
        personArrayList.add(new Person("Petr", 31, 256236523));
        personArrayList.add(new Person("Viktor", 39, 234263245));
        personArrayList.add(new Person("Vladislav", 25, 23452346));
        personArrayList.add(new Person("Alex", 30, 4657545));
        personArrayList.add(new Person("John", 33, 2365456));
        personArrayList.add(new Person("Olga", 28, 45684564));


        //System.out.println(personArrayList);

        for (int i = 0; i < personArrayList.size(); i++) {
            Person currentPerson = personArrayList.get(i);

            currentPerson.say();
            String newPersonName = currentPerson.getName();
            currentPerson.setName(newPersonName + " super HERO!");
            currentPerson.say();
        }

    }
}
