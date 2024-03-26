public class Employee extends Person{
    private String companyName;

    public Employee(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void say(){
        System.out.println("Добрый день, меня зовут " + getName() + ". Я работаю в компании " + getCompanyName());
    }
}
