import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Philip on 2/20/17.
 */
public class TestProblem2 {
    @Test
    public void testProblem2a () {
        int[] ints = { 1, 2, 3, 4, 5, 10 };

        int[] products = Problem2.getProductsOfAllIntsExceptAtIndex(ints);
        assertArrayEquals(new int[] {1200, 600, 400, 300, 240, 120 }, products);
    }

    @Test
    public void testProblem2b () {
        int[] ints = { 1, 2, 3, 0, 5, 10 };

        int[] products = Problem2.getProductsOfAllIntsExceptAtIndex(ints);
        assertArrayEquals(new int[] {0, 0, 0, 300, 0, 0 }, products);
    }
}
