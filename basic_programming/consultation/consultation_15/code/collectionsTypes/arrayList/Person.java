package code.collectionsTypes.arrayList;

public class Person {
    private String name;
    private int age;
    private long personalCode;

    public Person(String name, int age, long personalCode) {
        this.name = name;
        this.age = age;
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(long personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personalCode=" + personalCode +
                '}';
    }

    public void say() {
        System.out.println("Hello! My name is " + name);
    }
}
