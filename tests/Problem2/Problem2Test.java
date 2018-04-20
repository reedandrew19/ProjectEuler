package Problem2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static Problem2.Problem2.sumFibonacciRecursive;
import static org.junit.Assert.*;

/**
 * Created by Andrew on 3/24/2018.
 */
public class Problem2Test{
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testSumFibonacciNegativeCase(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Argument must be at least 1.");

        sumFibonacciRecursive(-1);
    }

    @Test
    public void testSumFibonacci1EqualsSumBoundary(){
        assertEquals(0, sumFibonacciRecursive(0));
        assertEquals(2, sumFibonacciRecursive(2));
        assertEquals(10, sumFibonacciRecursive(8));
    }

    @Test
    public void testSumFibonacciLessThanSumBoundary(){
        assertEquals(0, sumFibonacciRecursive(1));
        assertEquals(2, sumFibonacciRecursive(3));
        assertEquals(2, sumFibonacciRecursive(7));
    }
}