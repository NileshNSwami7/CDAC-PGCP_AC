package BinarySearchTree;
/**
 * Day 6 - AVL tree: a BST that keeps itself balanced.
 * AVL property: at every node, |height(left) - height(right)| <= 1  (balance factor in {-1, 0, +1}).
 * After each insert/delete we walk back up the path and fix any node with |bf| = 2 using ROTATIONS.
 * Height is always <= ~1.44 log2 n, so search/insert/delete are O(log n) in the WORST case.
 */
public class AVLTree {

    static class Node {
        int key, height;             // height of a leaf = 0
        Node left, right;
        Node(int key) { this.key = key; }
    }

    Node root;
    boolean trace = true;            // print every rotation

    static int h(Node n) { return n == null ? -1 : n.height; }
    static int balance(Node n) { return n == null ? 0 : h(n.left) - h(n.right); }   // > 0 means left-heavy
    static void update(Node n) { n.height = 1 + Math.max(h(n.left), h(n.right)); }

    //        y                x
    //       / \              / \
    //      x   C   ---->    A   y
    //     / \                  / \
    //    A   B                B   C
    Node rotateRight(Node y) {
        Node x = y.left, B = x.right;
        x.right = y;
        y.left = B;
        update(y); update(x);        // y is now below x: update y first
        return x;                    // x is the new root of this subtree
    }

    //      x                    y
    //     / \                  / \
    //    A   y     ---->      x   C
    //       / \              / \
    //      B   C            A   B
    Node rotateLeft(Node x) {
        Node y = x.right, B = y.left;
        y.left = x;
        x.right = B;
        update(x); update(y);
        return y;
    }

    Node rebalance(Node n) {
        update(n);
        int bf = balance(n);
        if (bf > 1) {                                   // left-heavy
            if (balance(n.left) < 0) {                  // LR case: first rotate the child left
                log("LR at " + n.key + ": rotateLeft(" + n.left.key + "), then rotateRight(" + n.key + ")");
                n.left = rotateLeft(n.left);
            } else log("LL at " + n.key + ": rotateRight(" + n.key + ")");
            return rotateRight(n);
        }
        if (bf < -1) {                                  // right-heavy
            if (balance(n.right) > 0) {                 // RL case
                log("RL at " + n.key + ": rotateRight(" + n.right.key + "), then rotateLeft(" + n.key + ")");
                n.right = rotateRight(n.right);
            } else log("RR at " + n.key + ": rotateLeft(" + n.key + ")");
            return rotateLeft(n);
        }
        return n;                                       // already balanced
    }

    void insert(int key) { root = insert(root, key); }
    Node insert(Node n, int key) {
        if (n == null) return new Node(key);            // ordinary BST insert ...
        if (key < n.key) n.left = insert(n.left, key);
        else if (key > n.key) n.right = insert(n.right, key);
        else return n;                                  // duplicate
        return rebalance(n);                            // ... then fix balance on the way back up
    }

    void delete(int key) { root = delete(root, key); }
    Node delete(Node n, int key) {
        if (n == null) return null;
        if (key < n.key) n.left = delete(n.left, key);
        else if (key > n.key) n.right = delete(n.right, key);
        else {
            if (n.left == null) return n.right;
            if (n.right == null) return n.left;
            Node s = n.right; while (s.left != null) s = s.left;
            n.key = s.key;
            n.right = delete(n.right, s.key);
        }
        return rebalance(n);
    }

    boolean contains(int key) {
        Node c = root;
        while (c != null) { if (key == c.key) return true; c = key < c.key ? c.left : c.right; }
        return false;
    }

    void log(String s) { if (trace) System.out.println("    rotation " + s); }

    void print(Node n, String ind) {
        if (n == null) return;
        print(n.right, ind + "        ");
        System.out.println(ind + n.key + " (bf " + balance(n) + ")");
        print(n.left, ind + "        ");
    }

    void inorder(Node n, StringBuilder sb) { if (n == null) return; inorder(n.left, sb); sb.append(n.key).append(' '); inorder(n.right, sb); }

    public static void main(String[] args) {
        AVLTree t = new AVLTree();
        int[] keys = {10, 20, 30, 40, 50, 25};
        for (int k : keys) {
            System.out.println("insert " + k);
            t.insert(k);
        }
        System.out.println("\nfinal tree (root on the left), with balance factors:");
        t.print(t.root, "  ");
        StringBuilder sb = new StringBuilder(); t.inorder(t.root, sb);
        System.out.println("inorder: " + sb + "  height = " + h(t.root));

        System.out.println("\ndelete 40:");
        t.delete(40);
        t.print(t.root, "  ");

        // The four cases on tiny trees
        System.out.println("\nThe four cases:");
        int[][] cases = {{30, 20, 10}, {10, 20, 30}, {30, 10, 20}, {10, 30, 20}};
        String[] names = {"LL", "RR", "LR", "RL"};
        for (int i = 0; i < 4; i++) {
            AVLTree c = new AVLTree();
            System.out.println("  insert " + java.util.Arrays.toString(cases[i]) + " (" + names[i] + ")");
            for (int k : cases[i]) c.insert(k);
            System.out.println("    root is now " + c.root.key + " with children " + c.root.left.key + " and " + c.root.right.key);
        }
    }
}
