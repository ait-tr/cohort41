package generic2;

public class TestDemo {
    public static void main(String[] args) {
        Test<Integer, String> test = new Test<>(25,"Generics");

        test.print();


        Test<Integer, Integer> test1 = new Test<>(10,150);
        test1.print();

        Test<String, String> test2 = new Test<>("text1","text2");
        test2.print();

    }
}
