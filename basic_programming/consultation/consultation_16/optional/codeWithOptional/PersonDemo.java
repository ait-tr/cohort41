package optional.codeWithOptional;

import java.util.Optional;

public class PersonDemo {
    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();

        repository.addPerson(1, new Person("Bill"));
        repository.addPerson(2, new Person("John"));
        repository.addPerson(3, new Person("James"));
        repository.addPerson(4, new Person("Ruslan"));
        repository.addPerson(5, new Person("Olga"));
        repository.addPerson(7, new Person(null));


        //repository.printData();

        Optional<Person> optionalFoundedPerson = repository.findById(7);

        if (optionalFoundedPerson.isPresent()) {
            Person foundedPerson = optionalFoundedPerson.get();
            System.out.println("Длина имени = " + foundedPerson.getName().length());
        } else {
            System.out.println("Такого нет в базе");
        }

    }
}
