public class BigDog {

    String breed;
    String name;
    int age;


    public BigDog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public BigDog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BigDog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
