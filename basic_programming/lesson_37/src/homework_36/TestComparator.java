package homework_36;
/*
@date 06.03.2024
@author Sergey Bugaienko
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class TestComparator {

    Integer[] array;

    @BeforeEach
    void setUp() {
        array = new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
    }

    @Test
    void testTask1Comparator() {
        Arrays.sort(array, new Task1Comparator());
        Assertions.assertArrayEquals(new Integer[]{2, 4, 6, 8, 1, 3, 5, 7, 7, 9}, array);
    }

    @ParameterizedTest
    @MethodSource("getTwoArrays")
    void testTask2Comparator(Integer[] integers, Integer[] expected) {
        System.out.println("Task2 method start!");
        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n % 2 == 0 ? -1 : 1)
                .thenComparingInt(x -> x % 2 == 0 ? x : -x)
        );
        System.out.println(Arrays.toString(integers));
        Assertions.assertArrayEquals(expected, integers);
    }

    static Stream<Arguments> getTwoArrays() {
        return Stream.of(
                Arguments.of(
                        new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3},
                        new Integer[]{2, 4, 6, 8, 9, 7, 7, 5, 3, 1}
                ),
                Arguments.of(
                        new Integer[]{2, 3, 1, 8, 6, 12, 11, 9, 6, 3},
                        new Integer[]{2, 6, 6, 8, 12, 11, 9, 3, 3, 1}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testDataGenerate")
    void testData(Integer[] integers, String string, boolean flag) {
        System.out.println(Arrays.toString(integers));
        System.out.println("Строка: " + string);
        System.out.println("Флаг: " + flag);
        System.out.println("===============\n");
    }

    static Stream<Arguments> testDataGenerate() {
        return Stream.of(
                Arguments.of(
                        new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3},
                        "Hello Java",
                        true
                ),
                Arguments.of(
                        new Integer[]{8, 9, 2, 7, 3},
                        "Python the best",
                        false
                )
        );
    }
}




















