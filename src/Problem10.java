import com.sun.javaws.exceptions.InvalidArgumentException;

import static com.sun.tools.doclets.internal.toolkit.util.DocPath.parent;

/**
 * Created by plarie on 2/25/17.
 */
public class Problem10 {
    public static Problem10Node secondLargestNode (Problem10Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Root must not be null");
        } else if (root.right == null && root.left == null) {
            throw new IllegalArgumentException("Tree must have at least two nodes");
        }

        Problem10Node parent = root;
        Problem10Node rightChild = root;

        while (rightChild.right != null) {
            parent = rightChild;
            rightChild = rightChild.right;
        }

        Problem10Node secondLargest = parent;
        if (rightChild.left != null) {
            secondLargest = rightChild.left;
            while (secondLargest.right != null) {
                secondLargest = secondLargest.right;
            }
        }

        return secondLargest;
    }
}
