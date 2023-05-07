import java.util.*;

public class Lab7 {
    public static void main(String[] args) throws Exception {
    // create the binary tree
        BinaryTree bt = BinaryTree.create();
        // traverse the binary tree using recursive InOrder traversal
        System.out.println("Nodes of binary tree on recursive InOrder traversal");
        //System.out.println(bt.root.data);
        bt.inOrder(bt.root);
        }
}

    class BinaryTree {
        static class TreeNode {
            int data;
            TreeNode left, right; // binary tree definition
            TreeNode(int val) {
                this.data = val;
                left = right = null;
            }
        }

        TreeNode root;

        public int inOrder(TreeNode node) {
            if (node == null) {
               return 0;
            } else {
                inOrder(node.left);
                System.out.println(node.data);
                inOrder(node.right);
            }
            return 1;
        }

    public static BinaryTree create() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(7);
        tree.root = root;
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(8);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.left = new TreeNode(4);
        tree.root.left.right.right = new TreeNode(6);
        tree.root.right.right = new TreeNode(9);
        return tree;
    }
}
