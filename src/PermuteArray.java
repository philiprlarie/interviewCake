/**
 * Created by plarie on 3/15/17.
 */
public class PermuteArray {

    public static char[] permute1 (char[] A, int[] R) {
        char[] output = new char[A.length];
        for (int i = 0; i < R.length; i++) {
            output[R[i]] = A[i];
        }

        return output;
    }

    public static char[] permute2 (char[] A, int[] R) {
        for (int i = 0; i < R.length; i++) {
            if (!alreadyDoneThisIndex(R, i)) {
                permuteFromIndex(A, R, i);
            }
        }

        return A;
    }

    private static void permuteFromIndex (char[] A, int[] R, int startIdx) {
        int idx = startIdx;
        char curChar = A[idx];
        while (true) {
            int nextIdx = R[idx];
            char nextChar = A[nextIdx];

            A[nextIdx] = curChar;

            idx = nextIdx;
            curChar = nextChar;
            if (idx == startIdx) {
                break;
            }
        }
    }

    private static boolean alreadyDoneThisIndex (int[] R, int startIdx) {
        int idx = startIdx;
        while (true) {
            idx = R[idx];
            if (idx < startIdx) {
                return true;
            } else if (idx == startIdx) {
                return false;
            }
        }
    }

//    public static void main (String[] args) {
//        int[] R = { 4, 2, 0, 1, 3 };
//        char[] A = { 'a', 'b', 'c', 'd', 'e' };
//        System.out.println(permute1(A, R));
//        System.out.println(permute2(A, R));
//
//        int[] R2 = { 4, 2, 0, 1, 3, 8, 7, 5, 6, 9, 10 };
//        char[] A2 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };
//        System.out.println(permute1(A2, R2));
//        System.out.println(permute2(A2, R2));
//    }
}