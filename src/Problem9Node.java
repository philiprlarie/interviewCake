/**
 * Created by plarie on 2/23/17.
 */
public class Problem9Node {
    public Problem9Node left;
    public Problem9Node right;
    public int value;

    public Problem9Node (int value) {
        this.value = value;
    }

    public Problem9Node (int value, Problem9Node left, Problem9Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
