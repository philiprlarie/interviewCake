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

////        System.out.println(Gcd.euclidsAlgo(100, 75)); // should be 25
////        System.out.println(Gcd.euclidsAlgo(99, 60)); // should be 3
////        System.out.println(Gcd.euclidsAlgo(225, 345)); // should be 15
