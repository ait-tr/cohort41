package methodsWithReturnResult;

public class SumExample {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        int a = 10;
        int b = 20;

        myCalculator.sumWithoutReturnResult(a,b);


        int sumResult = myCalculator.sumWithReturnResult(a,b);

        System.out.println("Удвоенный результат сложения = " + (2 * sumResult));

    }
}
