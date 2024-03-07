package compareObj.comparator;

public class Pair {
    private String ourString;
    private int ourInteger;

    public Pair(String ourString, int ourInteger) {
        this.ourString = ourString;
        this.ourInteger = ourInteger;
    }

    public String getOurString() {
        return ourString;
    }

    public int getOurInteger() {
        return ourInteger;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "ourString='" + ourString + '\'' +
                ", ourInteger=" + ourInteger +
                '}';
    }
}
