/**
 * Created by plarie on 3/7/17.
 */

public class DotWordTrie {
    TrieNode root = new TrieNode();

    public void addWord (String word, TrieNode startNode) {
        TrieNode curTrieNode;
        if (startNode == null) {
            curTrieNode = root;
        } else {
            curTrieNode = startNode;
        }

        if (word.length() == 0) {
            curTrieNode.setIsEndPoint(true);
            return;
        }

        char curChar = word.charAt(0);
        TrieNode child;
        if (curTrieNode.getChildren().containsKey(curChar)) {
            child = curTrieNode.getChildren().get(curChar);
        } else {
            child = new TrieNode(curChar);
            curTrieNode.getChildren().put(curChar, child);
        }
        addWord(word.substring(1), child);

        TrieNode dotChild;
        if (curTrieNode.getChildren().containsKey('.')) {
            dotChild = curTrieNode.getChildren().get('.');
        } else {
            dotChild = new TrieNode('.');
            curTrieNode.getChildren().put('.', dotChild);
        }
        addWord(word.substring(1), dotChild);
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
}
