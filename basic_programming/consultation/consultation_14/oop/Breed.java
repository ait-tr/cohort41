package oop;

public class Breed {
    int breedId;
    String name;

    public Breed(int breedId, String name) {
        this.breedId = breedId;
        this.name = name;
    }

    public int getBreedId() {
        return breedId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "breedId=" + breedId +
                ", name='" + name + '\'' +
                '}';
    }
}
