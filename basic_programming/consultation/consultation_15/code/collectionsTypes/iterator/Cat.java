package code.collectionsTypes.iterator;

public class Cat {

    private String name;

    public Cat(String cat) {
        this.name = cat;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cat='" + name + '\'' +
                '}';
    }
}
