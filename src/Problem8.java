import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by plarie on 2/22/17.
 */
public class Problem8 {
    public static boolean checkTreeBalanced (Problem8Node root) {
        Stack<Problem8Node> stack = new Stack<>();
        Set<Problem8Node> visitedNodes = new HashSet<>();
        stack.add(root);
        visitedNodes.add(root);

        int depth1 = -1;
        int depth2 = -1;


        while (!stack.empty()) {
            Problem8Node curNode = stack.peek();
            Problem8Node leftChild = curNode.left;
            Problem8Node rightChild = curNode.right;

            // we have a leaf
            if (leftChild == null && rightChild == null) {
                if (stack.size() == depth1 || stack.size() == depth2) {
                    stack.pop();
                    continue;
                } else if (depth1 == -1) {
                    depth1 = stack.size();
                } else if (depth2 == -1) {
                    depth2 = stack.size();
                    if (Math.abs(depth2 - depth1) > 1) {
                        return false;
                    }
                } else if (stack.size() != depth1 && stack.size() != depth2) {
                    return false;
                } else {
                    stack.pop();
                    continue;
                }
            }

            if (leftChild != null && !visitedNodes.contains(leftChild)) {
                visitedNodes.add(leftChild);
                stack.add(leftChild);
                continue;
            }
            if (rightChild != null && !visitedNodes.contains(rightChild)) {
                visitedNodes.add(rightChild);
                stack.add(rightChild);
                continue;
            }

            stack.pop();
        }

        return true;
    }
}