package staticExample;

import com.sun.tools.javac.Main;

public class CalcDemo {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.sum(3,4));

        System.out.println(CalcStatic.sum(5,10));

        System.out.println(Math.PI);


    }
}
