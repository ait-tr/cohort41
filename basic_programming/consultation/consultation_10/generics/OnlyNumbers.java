package generics;

public class OnlyNumbers <T extends Number> {
    private T number;

    public OnlyNumbers(T number) {
        this.number = number;
    }

    public void print(){
        System.out.println("Ваш номер: " + number);
    }

    public void printSquare(){
        System.out.println("Квадрат вашего числа: " + (number.doubleValue() * number.doubleValue()));
    }
}
