package methods;

public class Calculator {

    public void sum(){
        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println("Результат сложения: " + result);
    }

    public void sumWithParameters(int x, int y){
        int result = x + y;
        System.out.println("Результат сложения: " + result);

    }

    public int sumWithParameterReturnResult(int x, int y){
        int result = x + y;
        return result;
    }

}
