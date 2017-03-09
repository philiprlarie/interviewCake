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


//        System.out.println(CreateChange.createChange(4, new int[] {1, 2, 3})); // should be 4
//        System.out.println(CreateChange.createChange(10, new int[] {2, 5, 3, 6})); // should be 5
////        https://www.codechef.com/problems/CHANGE
////        System.out.println(CreateChange.createChange(380134, new int[] {2, 5, 23}));
////        long startTime = System.nanoTime();
////        System.out.println(CreateChange.createChange(12000, new int[] {6, 5, 2, 8, 1, 4, 7, 3}) % 1000000007); // should be 314159265
////        long endTime = System.nanoTime();
//
////        long duration = (endTime - startTime) / 100000000;
////        System.out.println(duration);
//
//
//        long startTime;
//        long endTime;
//        long duration;
//
//        startTime = System.nanoTime();
//        System.out.println(CreateChange.createChange(10010, new int[] {4, 3, 2, 5}));
//        endTime = System.nanoTime();
//        duration = (endTime - startTime) / 1000000;
//        System.out.println(duration);
//
//        startTime = System.nanoTime();
//        System.out.println(CreateChange.createChange2(10010, new int[] {4, 3, 2, 5}));
//        endTime = System.nanoTime();
//        duration = (endTime - startTime) / 1000000;
//        System.out.println(duration);
//

