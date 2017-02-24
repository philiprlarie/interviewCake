import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Philip on 2/21/17.
 */
public class TestProblem5 {
    @Test
    public void testProblem5a () {
        int amount = 4;
        int[] denominations = new int[] { 1, 2, 3 };
        int expectedNumWays = 4;
        int actualNumWays = Problem5.numWaysToMakeChange(amount, denominations);

        assertEquals(expectedNumWays, actualNumWays);
    }

    @Test
    public void testProblem5b () {
        int amount = 10;
        int[] denominations = new int[] { 2, 5, 3, 6 };
        int expectedNumWays = 5;
        int actualNumWays = Problem5.numWaysToMakeChange(amount, denominations);

        assertEquals(expectedNumWays, actualNumWays);
    }

    @Test
    public void testProblem5c () {
        // example from https://www.codechef.com/problems/CHANGE
        int amount = 380134;
        int[] denominations = new int[] { 23, 5, 2 };
        int expectedNumWays = 314159265;
        int actualNumWays = Problem5.numWaysToMakeChange(amount, denominations) % 1000000007;

        assertEquals(expectedNumWays, actualNumWays);
    }
}
