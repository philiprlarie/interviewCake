/**
 * Created by Philip on 2/20/17.
 * You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
 */

/**
 * Some critical thinking here.
 */

public class Problem2 {
    // nieve solution O(n^2)
//    public static int[] getProductsOfAllIntsExceptAtIndex (int[] ints) {
//        int[] products = new int[ints.length];
//        for (int i = 0; i < ints.length; i++) {
//            int product = 1;
//            for (int j = 0; j < ints.length; j++) {
//                if (j != i) {
//                    product *= ints[j];
//                }
//            }
//            products[i] = product;
//        }
//        return products;
//    }

//    allocates 3 arrays. we can do better
//    public static int[] getProductsOfAllIntsExceptAtIndex (int[] ints) {
//        int[] products = new int[ints.length];
//
//        int[] productsFromLeft = new int[ints.length];
//        int[] productsFromRight = new int[ints.length];
//        productsFromLeft[0] = 1;
//        productsFromRight[productsFromRight.length - 1] = 1;
//
//        for (int i = 1; i < ints.length; i++) {
//            productsFromLeft[i] = productsFromLeft[i - 1] * ints[i - 1];
//        }
//        for (int i = ints.length - 2; i >= 0; i--) {
//            productsFromRight[i] = productsFromRight[i + 1] * ints[i + 1];
//        }
//        for (int i = 0; i < ints.length; i++) {
//            products[i] = productsFromLeft[i] * productsFromRight[i];
//        }
//        return products;
//    }

    public static int[] getProductsOfAllIntsExceptAtIndex (int[] ints) {
        int[] products = new int[ints.length];

        products[0] = 1;

        // create array with products of all ints to left of index
        for (int i = 1; i < ints.length; i++) {
            products[i] = products[i - 1] * ints[i - 1];
        }
        int productsFromRight = 1;
        for (int i = ints.length - 2; i >= 0; i--) {
            productsFromRight *= ints[i + 1];
            products[i] = products[i] * productsFromRight;
        }
        return products;
    }
}
