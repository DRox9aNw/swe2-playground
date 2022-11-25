package ch.juventus.javadoc;

import java.util.List;

/**
 * Simple utility class for basic mathematical operations
 *
 * @author DRox9aNw
 * @version 1.0
 */

public class MathUtils {

    /**
     * adds all numbers in the given list
     * @param numbers the list of numbers to be summed
     * @return sum of all the numbers in the list
     * @throws NullPointerException IF list is empty
     */
    public double addition(List<Number> numbers) {
        double sum = 0;
        for (Number number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    /**
     * subtracts the second param from the first
     * @param a minuend
     * @param b subtrahend
     * @return difference
     */
    public double subtraction(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }

    /**
     * multiplies the two params
     * @param a multiplier
     * @param b multiplicand
     * @return product
     */
    public double multiplication(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    /**
     * divides the second param from the first
     * @param a dividend
     * @param b divisor
     * @return quotient
     */
    public double division(Number a, Number b) {
        return a.doubleValue() / b.doubleValue();
    }
}