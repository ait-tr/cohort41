package exceptions.error;

public class StackOverFlow {
    public static void main(String[] args) {
        StackOverFlow stack = new StackOverFlow();

        int count = 0;
        stack.stackOn(count);

    }

    public void stackOn(int count){
        count++;
        System.out.print(count + ", ");
        stackOn(count);
    }
}
