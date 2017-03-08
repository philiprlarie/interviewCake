/**
 * Created by plarie on 2/25/17.
 */
public class Problem10Node {
    public Problem10Node left;
    public Problem10Node right;
    public int value;

    public Problem10Node (int value) {
        this.value = value;
    }

    public Problem10Node (int value, Problem10Node left, Problem10Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
