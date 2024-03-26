package compareObj.comparable;

public class Cat implements Comparable<Cat>{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat otherCat) {
        //return this.name.compareTo(otherCat.name);
        int compareResult = otherCat.age - this.age;

        if (compareResult == 0) {
            compareResult = otherCat.name.compareTo(this.name);
        }

        return compareResult;
    }
}
