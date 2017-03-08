/**
 * Created by plarie on 2/25/17.
 */
public class Problem11 {
    public static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        while (start <= end) {
            middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] < target) {
                start = middle + 1;
                continue;
            } else if (arr[middle] > target) {
                end = middle - 1;
            }
        }

        return -1;
    }
}
