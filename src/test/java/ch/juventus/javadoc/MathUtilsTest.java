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
        assertThrows(NullPointerException.class, () -> mathUtils.addition(null));
    }

    @Test
    void testAdditionWithEmptyEntries() {
        List<Number> numberList = new ArrayList<>();
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(0, resultNumberList, "addition was wrong");
    }

    @Test
    void testAdditionWithOneEntries() {
        List<Number> numberList = new ArrayList<>() {{
            add(12.2);
        }};
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(12.2, resultNumberList, "addition was wrong");
    }

    @Test
    void testAdditionWithTwoEntries() {
        List<Number> numberList = new ArrayList<>() {{
            add(12.2);
            add(20.8);
        }};
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(33, resultNumberList, "addition was wrong");
    }

    @Test
    void testAdditionWithFourEntries() {
        List<Number> numberList = new ArrayList<>() {{
            add(5);
            add(12.2);
            add(20.8);
            add(4d);
        }};
        double resultNumberList = mathUtils.addition(numberList);
        assertEquals(42, resultNumberList, "addition was wrong");
    }

    @Test
    void subtraction() {
        assertEquals(100, mathUtils.subtraction(200, 100), 0.00001, "subtraction was wrong");
        assertEquals(22.2, mathUtils.subtraction(66.4, 44.2), 0.00001,"subtraction was wrong");
        assertEquals(-98, mathUtils.subtraction(1, 99), 0.00001,"subtraction was wrong");
        assertEquals(150.5, mathUtils.subtraction(-50, -200.5), 0.00001,"subtraction was wrong");
        assertEquals(-250.5, mathUtils.subtraction(-50, 200.5), 0.00001,"subtraction was wrong");
    }

    @Test
    void multiplication() {
        assertEquals(66, mathUtils.multiplication(2, 33), "multiplication was wrong");
        assertEquals(-25, mathUtils.multiplication(-5, 5), "multiplication was wrong");
        assertEquals(15, mathUtils.multiplication(-1.5, -10), "multiplication was wrong");
        assertEquals(-140, mathUtils.multiplication(56, -2.5), "multiplication was wrong");
    }

    @Test
    void division() {
        assertEquals(10, mathUtils.division(100, 10), "division was wrong");
        assertEquals(-2.5, mathUtils.division(-5, 2), "division was wrong");
        assertEquals(101.1, mathUtils.division(-202.2, -2), "division was wrong");
        assertEquals(-33, mathUtils.division(99, -3), "division was wrong");
    }
}