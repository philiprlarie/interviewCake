import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by plarie on 2/21/17.
 */
public class Application {
    public static void main (String[] args) {
        //////////////////// Problem 5
//
//        //////////////////// Problem 8
//        Problem8Node node1 = new Problem8Node(1);
//        Problem8Node node2 = new Problem8Node(2);
//        Problem8Node node3 = new Problem8Node(3);
//
//        node1.left = node2;
//        node1.right = node3;
//        System.out.println(Problem8.checkTreeBalanced(node1));
//
//        Problem8Node[] nodes = new Problem8Node[15];
//        for (int i = 0; i < 15; i++) {
//            nodes[i] = new Problem8Node(i);
//        }
//        for (int i = 0; i < 15; i++) {
//            if (i * 2 + 1 < 15) {
//                nodes[i].left = nodes[i * 2 + 1];
//            }
//            if (i * 2 + 2 < 15) {
//                nodes[i].right = nodes[i * 2 + 2];
//            }
//        }
//        System.out.println(Problem8.checkTreeBalanced(nodes[0]));
//
//
//        int numNodes = 13;
//        nodes = new Problem8Node[numNodes];
//        for (int i = 0; i < numNodes; i++) {
//            nodes[i] = new Problem8Node(i);
//        }
//        for (int i = 0; i < numNodes; i++) {
//            if (i * 2 + 1 < numNodes) {
//                nodes[i].left = nodes[i * 2 + 1];
//            }
//            if (i * 2 + 2 < numNodes) {
//                nodes[i].right = nodes[i * 2 + 2];
//            }
//        }
//        System.out.println(Problem8.checkTreeBalanced(nodes[0]));
//
//        nodes[2].left = null;
//        nodes[2].right = null;
//        System.out.println(Problem8.checkTreeBalanced(nodes[0]));

//
//
//        //////////////////// Problem 9
//        Problem9Node node1 = new Problem9Node(1);
//        Problem9Node node2 = new Problem9Node(2);
//        Problem9Node node3 = new Problem9Node(3);
//        node1.left = node2;
//        node1.right = node3;
//        System.out.println(Problem9.isValidBinarySearchTree(node1));
//
//        node1 = new Problem9Node(2);
//        node2 = new Problem9Node(1);
//        node3 = new Problem9Node(3);
//        node1.left = node2;
//        node1.right = node3;
//        System.out.println(Problem9.isValidBinarySearchTree(node1));
//
//
//        node1 = new Problem9Node(1);
//        node2 = new Problem9Node(2);
//        node3 = new Problem9Node(3);
//        Problem9Node node4 = new Problem9Node(4);
//        Problem9Node node5 = new Problem9Node(5);
//        Problem9Node node6 = new Problem9Node(6);
//        Problem9Node node7 = new Problem9Node(7);
//        Problem9Node node8 = new Problem9Node(8);
//        Problem9Node node9 = new Problem9Node(9);
//        Problem9Node node10 = new Problem9Node(10);
//        Problem9Node node11 = new Problem9Node(11);
//        Problem9Node node12 = new Problem9Node(12);
//
//        node6.left = node5;
//        node5.left = node4;
//        node4.left = node3;
//        node3.left = node2;
//        node2.left = node1;
//        node6.right = node8;
//        node8.right = node9;
//        node8.left = node7;
//        node9.right = node10;
//        node10.right = node12;
//        node12.left = node11;
//        System.out.println(Problem9.isValidBinarySearchTree(node6));

//        String[] words = {"hat", "hoe", "mailman", "mailwoman", "mailwitch", "fart", "fatass"};
//        Trie trie = new Trie();
//
//        for (String word : words) {
//            trie.addWord(word);
//        }
//        System.out.println(trie.checkForWord("mailwitch"));
//        System.out.println(trie.checkForWord("mailwoman"));
//        System.out.println(trie.checkForWord("mailwit"));
//        System.out.println(trie.checkForWord("mwawawaw"));
//        System.out.println(trie.checkForWord("hoe"));
//        System.out.println(trie.checkForWord("hoes"));
//        System.out.println("try with dots now");
//        System.out.println(trie.checkForWord("mai.witch"));


        String[] words = {"hat", "hoe", "mailman", "mailwoman", "mailwitch", "fart", "fatass"};
        DotWordTrie trie = new DotWordTrie();

        for (String word : words) {
            trie.addWord(word, null);
        }

        System.out.println("mailwitch: " + trie.checkForWord("mailwitch"));
        System.out.println(trie.checkForWord("mailwoman"));
        System.out.println(trie.checkForWord("mailwit"));
        System.out.println(trie.checkForWord("mwawawaw"));
        System.out.println(trie.checkForWord("hoe"));
        System.out.println(trie.checkForWord("hoes"));
        System.out.println("try with dots now");
        System.out.println(trie.checkForWord("mai.witch"));
        System.out.println(trie.checkForWord("mai.wit.h"));
        System.out.println(trie.checkForWord("mai.."));
        System.out.println(trie.checkForWord("........."));
        System.out.println(trie.checkForWord(".,,.,"));



    }
}
