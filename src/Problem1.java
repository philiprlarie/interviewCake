import java.util.IllegalFormatCodePointException;

/**
 * Created by Philip on 2/20/17.
 */

// greedy algorithm. Do a linear scan through the input, keep track of as much info as you need so you can make linear time updates as you go.
// keep track of the maxProfit so far as well as the lowest price seen.

public class Problem1 {
    public static int getMaxProfit  (int[] stockPricesYesterday)  throws IllegalArgumentException {
        if (stockPricesYesterday.length < 2) {
            throw new IllegalArgumentException();
        }

        int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
        int minPrice = Math.min(stockPricesYesterday[0], stockPricesYesterday[1]);

        for (int i = 2; i < stockPricesYesterday.length; i++) {
            maxProfit = Math.max(maxProfit, stockPricesYesterday[i] - minPrice);
            minPrice = Math.min(minPrice, stockPricesYesterday[i]);
        }
        return maxProfit;
    }
}
