public class Student extends Person {
    private String collegeName;

    public Student(String name, int age, String collegeName) {
        super(name, age);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public void say(){
        System.out.println("Меня зовут " + getName() + ". Я учусь в " + getCollegeName());

    }


}
