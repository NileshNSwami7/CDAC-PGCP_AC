package BinarySearchTree;



public class ValidateBST {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isValidBST(Node root, long min, long max) {

        // Empty tree is a valid BST
        if (root == null) {
            return true;
        }

        // Current node must be within allowed range
        if (root.data <= min || root.data >= max) {
            return false;
        }

        // Check left subtree
        boolean leftValid = isValidBST(root.left, min, root.data);

        // Check right subtree
        boolean rightValid = isValidBST(root.right, root.data, max);

        return leftValid && rightValid;
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        if (isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Invalid BST");
        }
    }
}