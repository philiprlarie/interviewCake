import java.util.HashMap;

/**
 * Created by plarie on 3/7/17.
 */
public class TrieNode {
    private HashMap<Character, TrieNode> children = new HashMap<>();
    private char value;
    private boolean isEndPoint = false;
    public TrieNode () {}
    public TrieNode (char value) {
        this.value = value;
    }
    public void setIsEndPoint (boolean newValue) {
        this.isEndPoint = newValue;
    }
    public boolean isEndPoint () {
        return this.isEndPoint;
    }
    public HashMap<Character, TrieNode> getChildren () {
        return this.children;
    }
}
