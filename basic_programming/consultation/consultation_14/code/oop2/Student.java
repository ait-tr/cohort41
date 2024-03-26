package code.oop2;

public class Student {
    private Person person;
    private String group;

    public Student(Person person, String group) {
        this.person = person;
        this.group = group;
    }

    public Person getPerson() {
        return person;
    }

    public String getGroup() {
        return group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", group='" + group + '\'' +
                '}';
    }
}
