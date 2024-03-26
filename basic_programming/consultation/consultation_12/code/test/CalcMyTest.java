package code.test;

public class CalcMyTest {
    public static void main(String[] args) {
        Calc calc = new Calc();

        int x = 10;
        int y = 5;

        int expectedResult = 15;
        int actualResult = calc.sum(x,y);
        //-------------------------------------

        if (expectedResult == actualResult) {
            System.out.println("Test 1. Method sum() is OK!");
        } else {
            System.out.println("Test 1. Method sum() is FAIL!");
            System.out.println("Expected result " + expectedResult + ", but received " + actualResult);
        }



    }
}
