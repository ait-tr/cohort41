
package methodsWithReturnResult;

public class Calculator {

    public void sumWithoutReturnResult(int x, int y){
        int result = x + y;

        System.out.println("Sum result = " + result);
    }

    public int sumWithReturnResult(int x, int y){
        int result = x + y;

        return result;

    }


}
