package optional.codeExample;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {

    private Map<Integer, Person> persons;

    public PersonRepository() {
        this.persons = new HashMap<>();
    }

    public void addPerson(int id, Person person){
        persons.put(id,person);
    }

    public Person findById(int id){
        return persons.get(id);
    }
    public void printData(){
        System.out.println(persons);
    }
}
