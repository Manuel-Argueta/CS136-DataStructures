import java.util.*;

public class Lab7 {
    public static void main(String[] args) throws Exception {
    // create the binary tree
        BinaryTree bt = BinaryTree.create();
        // traverse the binary tree using recursive InOrder traversal
        System.out.println("Nodes of binary tree on recursive InOrder traversal");
        bt.inOrder();
        }
}

    class BinaryTree {
        static class TreeNode {
        String data;
        TreeNode left, right; // binary tree definition
        TreeNode(String value) {
        this.data = value;
        left = right = null;
        }
        }
        // root of binary tree
        TreeNode root;
        /**
        * algorithm to traverse the binary tree on recursive InOrder
        */
        public void inOrder() {
        // TODO: define inOrder with root as parameter//
        }
        private void inOrder(TreeNode node) {
        // TODO: check if node is null {
        // TODO: return //
        }
        inOrder(node.left);
        // TODO: print node (node.data) during traversal
        // TODO: define inOrder for node.right
    /**
    * Java method to create binary tree with test data
    *
    */
    public static BinaryTree create() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode("G");
        // TODO set tree.root to root
        tree.root.left = new TreeNode("C");
        // TODO // = new TreeNode("B");
        // TODO // = new TreeNode("A");
        // TODO // = new TreeNode("E");
        // TODO // = new TreeNode("H");
        // TODO // = new TreeNode("I");
        // TODO // = new TreeNode("D");
        // TODO // = new TreeNode("F");
        return tree;
    }
}
