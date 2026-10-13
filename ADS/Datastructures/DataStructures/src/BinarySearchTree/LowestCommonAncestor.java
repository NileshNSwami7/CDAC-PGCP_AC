package BinarySearchTree;



public class LowestCommonAncestor {

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

    public static Node findLCA(Node root, int key1, int key2) {

        while (root != null) {

            // Both keys are smaller
            if (key1 < root.data && key2 < root.data) {
                root = root.left;
            }

            // Both keys are greater
            else if (key1 > root.data && key2 > root.data) {
                root = root.right;
            }

            // Keys are on different sides
            // or one key is equal to root
            else {
                return root;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int key1 = 20;
        int key2 = 40;

        Node result = findLCA(root, key1, key2);

        if (result != null) {
            System.out.println("LCA = " + result.data);
        } else {
            System.out.println("LCA not found");
        }
    }
}