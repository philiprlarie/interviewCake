import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Philip on 2/20/17.
 */
public class TestProblem3 {
    @Test
    public void testProblem3a () {
        int[] ints = { 1, 2, 3, 4, 5, 10 };

        int product = Problem3.highestProduct(ints);
        assertEquals(200, product);
    }

    // with negative value
    @Test
    public void testProblem3b () {
        int[] ints = { 1, 2, 3, 4, 5, -10 };

        int product = Problem3.highestProduct(ints);
        assertEquals(60, product);
    }

    // with two negative values
    @Test
    public void testProblem3c () {
        int[] ints = { -1, 2, 3, 4, 5, -50 };

        int product = Problem3.highestProduct(ints);
        assertEquals(250, product);
    }
}
