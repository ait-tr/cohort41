package code.optional.codeWithOptional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {

    private Map<Integer, Person> persons;

    public PersonRepository() {
        this.persons = new HashMap<>();
    }

    public void addPerson(int id, Person person){
        persons.put(id,person);
    }

    public Optional<Person> findById(int id){
        return Optional.ofNullable(persons.get(id));
    }

    public void printData(){
        System.out.println(persons);
    }
}
