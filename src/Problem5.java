import java.util.HashMap;

/**
 * Created by Philip on 2/21/17.
 */
public class Problem5 {
    public static int numWaysToMakeChange (int amount, int[] denominations) {
        int[] numWaysForNCents = new int[amount + 1];
        numWaysForNCents[0] = 1;


        for (int coin : denominations) {
            for (int n = coin; n <= amount; n++) {
                // the number of ways to make change is the number of ways not using a certain coin plus the number of ways using at least one of those coins
                numWaysForNCents[n] = numWaysForNCents[n] + numWaysForNCents[n - coin];
            }
        }

        return numWaysForNCents[numWaysForNCents.length - 1];
    }

//    // this way we don't use memoization. we are doing repeated work.
//    public static int createChange (int ammount, int[] coins) {
//        if (ammount <= 0) {
//            return 0;
//        }
//        if (coins.length <= 1) {
//            return ammount % coins[0] == 0 ? 1 : 0;
//        }
//
//        int totalWays = 0;
//        int[] coinsExceptLast = new int[coins.length - 1];
//        for (int i = 0; i < coins.length - 1; i++) {
//            coinsExceptLast[i] = coins[i];
//        }
//        int numLastCoin = 0;
//        int lastCoinValue = coins[coins.length - 1];
//        while (ammount - numLastCoin * lastCoinValue > 0) {
//            totalWays += createChange(ammount - numLastCoin * lastCoinValue, coinsExceptLast);
//            numLastCoin++;
//        }
//        // one extra edge case is using only the last coin
//        if (ammount - numLastCoin * lastCoinValue == 0) {
//            totalWays++;
//        }
//
//        return totalWays;
//    }

    // here we memoize. this helps save us repeated work.
    // how much memory might we use for single iteration? well we could have any amount from 0 to given amount. and the combination of coins we use is always increasing from smallest to larger and doesnt' skip. I.E. the num combinations we use is just num coins. total space is O(amount * numCoins)
    // note that coins sorted in order of min to max will have best performance (fewest number of recursive calls)
    // here is the logic, num of ways to make change is the sum of the num ways to make change with exactly some number of biggest coin for each possible number of biggest coins you could have.
    private static HashMap<String, Integer> memoizedNumWays = new HashMap<>();
    public static int createChange (int ammount, int[] coins) {
        if (ammount <= 0) {
            return 0;
        }
        if (coins.length <= 1) {
            return ammount % coins[0] == 0 ? 1 : 0;
        }
        // check our memoized results
        StringBuilder keyBuilder = new StringBuilder(ammount + ":");
        for (int i = 0; i < coins.length; i++) {
            keyBuilder.append(coins[i]);
            keyBuilder.append(',');
        }
        String key = keyBuilder.toString();
        if (memoizedNumWays.containsKey(key)) {
            return memoizedNumWays.get(key);
        }

        int totalWays = 0;
        int[] coinsExceptLast = new int[coins.length - 1];
        for (int i = 0; i < coins.length - 1; i++) {
            coinsExceptLast[i] = coins[i];
        }
        int numLastCoin = 0;
        int lastCoinValue = coins[coins.length - 1];
        while (ammount - numLastCoin * lastCoinValue > 0) {
            totalWays += createChange(ammount - numLastCoin * lastCoinValue, coinsExceptLast);
            numLastCoin++;
        }
        // one extra edge case is using only the last coin
        if (ammount - numLastCoin * lastCoinValue == 0) {
            totalWays++;
        }

        memoizedNumWays.put(key, totalWays);
        return totalWays;
    }


//    // the other memozied way is not good at all. you will inevitably do O(amount ^ 2) work. you have amount * coins number of keys in the hash map. each key takes O(amount) time to be added.
//    private static HashMap<String, Integer> memoizedNumWays = new HashMap<>();
//    public static int createChange (int ammount, int[] coins) {
//        if (ammount <= 0) {
//            return 0;
//        }
//        if (coins.length <= 1) {
//            return ammount % coins[0] == 0 ? 1 : 0;
//        }
//        // check our memoized results
//        StringBuilder keyBuilder = new StringBuilder(ammount + ":");
//        for (int i = 0; i < coins.length; i++) {
//            keyBuilder.append(coins[i]);
//            keyBuilder.append(',');
//        }
//        String key = keyBuilder.toString();
//        if (memoizedNumWays.containsKey(key)) {
//            return memoizedNumWays.get(key);
//        }
//
//        int totalWays = 0;
//        int[] coinsExceptLast = new int[coins.length - 1];
//        for (int i = 0; i < coins.length - 1; i++) {
//            coinsExceptLast[i] = coins[i];
//        }
//        int numLastCoin = 0;
//        int lastCoinValue = coins[coins.length - 1];
//        while (ammount - numLastCoin * lastCoinValue > 0) {
//            totalWays += createChange(ammount - numLastCoin * lastCoinValue, coinsExceptLast);
//            numLastCoin++;
//        }
//        // one extra edge case is using only the last coin
//        if (ammount - numLastCoin * lastCoinValue == 0) {
//            totalWays++;
//        }
//
//        memoizedNumWays.put(key, totalWays);
//        return totalWays;
//    }

    // teh logic here is, num of ways to make change is num ways to make change using at least one of the last denomination coin plus the number of ways to make change using none of the last denomination coin.
    // note that this algorithm is faster because we don't have the inner for loop, however, we are more suceptible to stack overflows. the stack here can be O(amount). but in the other algorithm, stack can be O(number of denominations)
    private static HashMap<String, Integer> memoizedNumWays2 = new HashMap<>();
    public static int createChange2 (int ammount, int[] coins) {
        if (ammount < 0) {
            return 0;
        }
        if (ammount == 0) {
            return 1;
        }
        if (coins.length <= 1) {
            return ammount % coins[0] == 0 ? 1 : 0;
        }
        // check our memoized results
        StringBuilder keyBuilder = new StringBuilder(ammount + ":");
        for (int i = 0; i < coins.length; i++) {
            keyBuilder.append(coins[i]);
            keyBuilder.append(',');
        }
        String key = keyBuilder.toString();
        if (memoizedNumWays2.containsKey(key)) {
            return memoizedNumWays2.get(key);
        }

        int totalWays = 0;
        int[] coinsExceptLast = new int[coins.length - 1];
        for (int i = 0; i < coins.length - 1; i++) {
            coinsExceptLast[i] = coins[i];
        }
//        int numLastCoin = 0;
        int lastCoinValue = coins[coins.length - 1];
//        while (ammount - numLastCoin * lastCoinValue > 0) {
//            totalWays += createChange(ammount - numLastCoin * lastCoinValue, coinsExceptLast);
//            numLastCoin++;
//        }
        totalWays += createChange2(ammount - lastCoinValue, coins);
        totalWays += createChange2(ammount, coinsExceptLast);

//        // one extra edge case is using only the last coin
//        if (ammount - numLastCoin * lastCoinValue == 0) {
//            totalWays++;
//        }

        memoizedNumWays2.put(key, totalWays);
        return totalWays;
    }
}
