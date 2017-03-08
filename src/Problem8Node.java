/**
 * Created by plarie on 2/22/17.
 */
public class Problem8Node<T> {
    public Problem8Node left;
    public Problem8Node right;
    public T value;

    public Problem8Node (T value) {
        this.value = value;
    }

    public Problem8Node (T value, Problem8Node left, Problem8Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
