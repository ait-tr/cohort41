/*
@date 08.02.2024
@author Sergey Bugaienko
*/

public class Test {

    static int counter;
    int x;
    public static void main(String[] args) {
        // x = 10; // Ошибка компиляции.
        // System.out.println(x); Ошибка компиляции.
        test();
        counter  = 100000;

       //  test2(); У статического контента нет доступа к не-статическому контенту
    }

    public static void test( ) {
        System.out.println("Test");
    }

    public void test2() {
        System.out.println("code.Test2");
    }
}
