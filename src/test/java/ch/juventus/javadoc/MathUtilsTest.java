package ch.juventus.javadoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdditionWithNullEntries() {
        List<Double> nullList = null;
        Throwable exception = assertThrows(NullPointerException.class, () -> mathUtils.addition(nullList));
    }

    @Test
    void testAdditionWithEmptyEntries() {
        List<Double> numberList = new ArrayList<>();
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(0, resultNumberList, "addition was wrong");
    }

    @Test
    void testAdditionWithOneEntries() {
        List<Double> numberList = new ArrayList<>() {{
            add(12.2);
        }};
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(12.2, resultNumberList, "addition was wrong");
    }

    @Test
    void testAdditionWithTwoEntries() {
        List<Double> numberList = new ArrayList<>() {{
            add(12.2);
            add(20.8);
        }};
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(33d, resultNumberList, "addition was wrong");
    }

    @Test
    void testAdditionWithFourEntries() {
        List<Double> numberList = new ArrayList<>() {{
            add(5d);
            add(12.2);
            add(20.8);
            add(4d);
        }};
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(42d, resultNumberList, "addition was wrong");
    }

    @Test
    void subtraction() {
        assertEquals(100, mathUtils.subtraction(200d, 100d), 0.00001, "subtraction was wrong");
        assertEquals(22.2, mathUtils.subtraction(66.4, 44.2), 0.00001,"subtraction was wrong");
        assertEquals(-98, mathUtils.subtraction(1d, 99d), 0.00001,"subtraction was wrong");
        assertEquals(150.5, mathUtils.subtraction(-50d, -200.5), 0.00001,"subtraction was wrong");
        assertEquals(-250.5, mathUtils.subtraction(-50d, 200.5), 0.00001,"subtraction was wrong");
    }

    @Test
    void multiplication() {
        assertEquals(66, mathUtils.multiplication(2d, 33d), "multiplication was wrong");
        assertEquals(-25, mathUtils.multiplication(-5d, 5d), "multiplication was wrong");
        assertEquals(15, mathUtils.multiplication(-1.5, -10d), "multiplication was wrong");
        assertEquals(-140, mathUtils.multiplication(56d, -2.5), "multiplication was wrong");
    }

    @Test
    void division() {
        assertEquals(10, mathUtils.division(100d, 10d), "division was wrong");
        assertEquals(-2.5, mathUtils.division(-5d, 2d), "division was wrong");
        assertEquals(101.1, mathUtils.division(-202.2, -2d), "division was wrong");
        assertEquals(-33, mathUtils.division(99d, -3d), "division was wrong");
    }
}