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
}
