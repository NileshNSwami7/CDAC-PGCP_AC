package BinarySearchTree;



import java.util.HashMap;

public class BuildTree {

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

    static int preIndex = 0;

    public static Node buildTree(
            int[] preorder,
            int[] inorder,
            int inStart,
            int inEnd,
            HashMap<Integer, Integer> map) {

        // No elements
        if (inStart > inEnd) {
            return null;
        }

        // First element of preorder is the root
        int rootValue = preorder[preIndex++];

        Node root = new Node(rootValue);

        // Find root position in inorder
        int rootIndex = map.get(rootValue);

        // Build left subtree
        root.left = buildTree(
                preorder,
                inorder,
                inStart,
                rootIndex - 1,
                map
        );

        // Build right subtree
        root.right = buildTree(
                preorder,
                inorder,
                rootIndex + 1,
                inEnd,
                map
        );

        return root;
    }

    public static void inorderTraversal(Node root) {

        if (root == null) {
            return;
        }

        inorderTraversal(root.left);

        System.out.print(root.data + " ");

        inorderTraversal(root.right);
    }

    public static void main(String[] args) {

        int[] preorder = {1, 2, 4, 5, 3, 6, 7};

        int[] inorder = {4, 2, 5, 1, 6, 3, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        Node root = buildTree(
                preorder,
                inorder,
                0,
                inorder.length - 1,
                map
        );

        System.out.println("Inorder traversal of constructed tree:");

        inorderTraversal(root);
    }
}
