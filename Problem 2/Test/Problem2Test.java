import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static Problem2.Problem2.sumFibonacci;
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

        sumFibonacci(-1);
    }

    @Test
    public void testSumFibonacci1EqualsSumBoundary(){
        assertEquals(0, sumFibonacci(0));
        assertEquals(2, sumFibonacci(2));
        assertEquals(10, sumFibonacci(8));
    }

    @Test
    public void testSumFibonacciLessThanSumBoundary(){
        assertEquals(0, sumFibonacci(1));
        assertEquals(2, sumFibonacci(3));
        assertEquals(2, sumFibonacci(7));
    }
}