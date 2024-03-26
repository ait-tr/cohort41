package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcTest {

   @Test
    void sum() {
        Calc calc = new Calc();

        int x = 10;
        int y = 5;

        int expectedResult = 15;
        int actualResult = calc.sum(x,y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sub() {
        Calc calc = new Calc();

        int x = 10;
        int y = 5;

        int expectedResult = 5;
        int actualResult = calc.sub(x,y);

        assertEquals(expectedResult, actualResult);
    }
}