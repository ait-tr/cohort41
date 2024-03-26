public class Generic5 <T> {

    T[] array;

    public Generic5(int arraySize) {

        this.array = (T[]) new Object[arraySize];
    }
}
