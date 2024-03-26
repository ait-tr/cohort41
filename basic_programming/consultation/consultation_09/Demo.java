import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Generic5<String> arr1 = new Generic5<>(10);

        System.out.println(Arrays.toString(arr1.array));

        Generic5<Integer> arr2 = new Generic5<>(10);

        System.out.println(Arrays.toString(arr2.array));
    }
}
