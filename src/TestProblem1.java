import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by Philip on 2/20/17.
 */
public class TestProblem1 {
    @Test
    public void testProblem1a () {
        int[] stockPricesYesterday = { 1, 2, 3, 4, 5, 10 };

        Problem1 problem1 = new Problem1();
        int maxProfit = problem1.getMaxProfit(stockPricesYesterday);
        assertEquals(9, maxProfit);
    }

    @Test
    public void testProblem1b () {
        // should return least negative result for day when stock prices continually fall
        int[] stockPricesYesterday = { 100, 90, 88, 50, 30, 20, 10, 1 };

        Problem1 problem1 = new Problem1();
        int maxProfit = problem1.getMaxProfit(stockPricesYesterday);
        assertEquals(-2, maxProfit);
    }

    @Test
    public void testProblem1c () {
        // should get the best price when you buy earlier in the day
        int[] stockPricesYesterday = { 50, 60, 70, 1, 50, 60, 90, 50, 60, 1000, 40 };

        Problem1 problem1 = new Problem1();
        int maxProfit = problem1.getMaxProfit(stockPricesYesterday);
        assertEquals(999, maxProfit);
    }

    @Test
    public void testProblem1d () {
        // shouldn't get fooled by lower price later in the day. must obey chronology
        int[] stockPricesYesterday = { 10, 1000, 50, 60, 1, 80, 90 };

        Problem1 problem1 = new Problem1();
        int maxProfit = problem1.getMaxProfit(stockPricesYesterday);
        assertEquals(990, maxProfit);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProblem1e () {
        // should throw IlleggalArgumentException when array has fewer than 2 elements
        int[] stockPricesYesterday = { 10 };

        Problem1 problem1 = new Problem1();
        problem1.getMaxProfit(stockPricesYesterday);
    }
}
