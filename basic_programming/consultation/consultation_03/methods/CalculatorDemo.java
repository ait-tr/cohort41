package methods;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator();

        System.out.println(myCalc);

        myCalc.sum();

        int x = 155;
        int y = 277;

        myCalc.sumWithParameters(x, y);


        int resultFromMethod = myCalc.sumWithParameterReturnResult(100,400);

        System.out.println(resultFromMethod);

    }

}
