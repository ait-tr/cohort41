package generics;

public class OnlyNumberDemo {
    public static void main(String[] args) {
        OnlyNumbers<Integer> numberInteger = new OnlyNumbers<>(1);

        OnlyNumbers<Long> numberLong = new OnlyNumbers<>(123L);

        OnlyNumbers<Double> numberDouble = new OnlyNumbers<>(1.2);

        numberInteger.print();

        numberLong.print();

        numberDouble.print();

        numberLong.printSquare();
    }
}
