/**
 * Created by Philip on 2/20/17.
 * Given an arrayOfInts, find the highestProduct you can get from three of the integers.
 */

// greedy algorithm. be smart about what you need to keep track of
public class Problem3 {
    public static int highestProduct (int[] arrayOfInts) throws IllegalArgumentException {
        if (arrayOfInts.length < 3) {
            throw new IllegalArgumentException();
        }

        int biggest3 = Integer.MIN_VALUE;
        int biggest2 = arrayOfInts[0] * arrayOfInts[1];
        int smallest2 = arrayOfInts[0] * arrayOfInts[1];
        int biggest1 = Math.max(arrayOfInts[0], arrayOfInts[1]);
        int smallest1 = Math.min(arrayOfInts[0], arrayOfInts[1]);

        for (int i = 2; i < arrayOfInts.length; i++) {
            biggest3 = Math.max(biggest3, Math.max(biggest2 * arrayOfInts[i], smallest2 * arrayOfInts[i]));
            biggest2 = Math.max(biggest2, Math.max(biggest1 * arrayOfInts[i], smallest1 * arrayOfInts[i]));
            smallest2 = Math.min(smallest2, Math.min(biggest1 * arrayOfInts[i], smallest1 * arrayOfInts[i]));
            smallest1 = Math.min(smallest1, arrayOfInts[i]);
            biggest1 = Math.max(biggest1, arrayOfInts[i]);
        }

        return biggest3;
    }
}
