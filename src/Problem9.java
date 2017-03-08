/**
 * Created by plarie on 2/23/17.
 */
public class Problem9 {

    private static int previousValue = Integer.MIN_VALUE;
    public static boolean isValidBinarySearchTree (Problem9Node root) {
        previousValue = Integer.MIN_VALUE;
        try {
            inOrderTraversal(root);
        } catch (Error failedTraversal) {
            return false;
        }

        previousValue = Integer.MIN_VALUE;
        return true;
    }

    private static void inOrderTraversal (Problem9Node node) {
        Problem9Node left = node.left;
        Problem9Node right = node.right;

        if (left != null) {
            inOrderTraversal(left);
        }

        if (node.value < previousValue) {
            throw new Error();
        } else {
            previousValue = node.value;
        }

        if (right != null) {
            inOrderTraversal(right);
        }
    }
}
