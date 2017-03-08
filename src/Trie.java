/**
 * Created by plarie on 3/7/17.
 */
public class Trie {
    TrieNode root = new TrieNode();

    public void addWord (String word) {
        TrieNode curTrieNode = root;
        for (int i = 0; i < word.length(); i++) {
            char curChar = word.charAt(i);
            if (curTrieNode.getChildren().containsKey(curChar)) {
                curTrieNode = curTrieNode.getChildren().get(curChar);
            } else {
                TrieNode newChild = new TrieNode(curChar);
                curTrieNode.getChildren().put(curChar, newChild);
                curTrieNode = newChild;
            }
        }
        curTrieNode.setIsEndPoint(true);
    }

    public boolean checkForWord (String word) {
        if (word == null) {
            return false;
        } else if (word.length() == 0) {
            return true;
        }
        TrieNode curNode = root;
        for (int i = 0; i < word.length(); i++) {
            char curChar = word.charAt(i);
            if (curNode.getChildren().containsKey(curChar)) {
                curNode = curNode.getChildren().get(curChar);
            } else {
                return false;
            }
        }
        return curNode.isEndPoint();
    }

    public boolean checkInnerWord (String word) {
        if (word == null) {
            return false;
        } else if (word.length() == 0) {
            return true;
        }
        TrieNode curNode = root;
        for (int i = 0; i < word.length(); i++) {
            char curChar = word.charAt(i);
            if (curNode.getChildren().containsKey(curChar)) {
                curNode = curNode.getChildren().get(curChar);
            } else {
                return false;
            }
        }
        return true;
    }
}
