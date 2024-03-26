package generic3;

public class FigureDemo {
    public static void main(String[] args) {
       Circle<Double> circle = new Circle(10.5);
        System.out.println(circle.calculateArea());

        Circle<Integer> circle1 = new Circle(10);
        System.out.println(circle1.calculateArea());
    }
}
