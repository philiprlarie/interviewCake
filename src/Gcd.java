/**
 * Created by plarie on 2/21/17.
 */
public class Gcd {
    public static int euclidsAlgo (int int1, int int2) {
        int larger = Math.max(int1, int2);
        int smaller = Math.min(int1, int2);
        int storage;

        while (smaller > 0) {
            storage = smaller;
            smaller = larger % smaller;
            larger = storage;
        }

        return larger;
    }
}
