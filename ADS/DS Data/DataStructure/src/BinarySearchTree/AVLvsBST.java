package BinarySearchTree;

/**
 * Day 6 - Sorted input: plain BST vs AVL tree.
 * (Both use iterative search; the BST insert is iterative so its degenerate shape cannot overflow the stack.)
 */
public class AVLvsBST {

    // ---- plain BST
    static class BNode { int key; BNode left, right; BNode(int k) { key = k; } }
    static BNode bstInsert(BNode root, int key) {
        BNode n = new BNode(key);
        if (root == null) return n;
        BNode c = root;
        while (true) {
            if (key < c.key) { if (c.left == null) { c.left = n; return root; } c = c.left; }
            else { if (c.right == null) { c.right = n; return root; } c = c.right; }
        }
    }
    static int bstHeight(BNode root) {       // iterative: walk right spine is enough for sorted input, but do it properly
        if (root == null) return -1;
        java.util.ArrayDeque<BNode> q = new java.util.ArrayDeque<>(); q.add(root); int h = -1;
        while (!q.isEmpty()) { h++; for (int i = q.size(); i > 0; i--) { BNode x = q.poll(); if (x.left != null) q.add(x.left); if (x.right != null) q.add(x.right); } }
        return h;
    }
    static int bstSteps(BNode root, int key) { int s = 0; for (BNode c = root; c != null; c = key < c.key ? c.left : c.right) { s++; if (c.key == key) break; } return s; }

    // ---- compact AVL (same logic as AVLTree.java, without tracing)
    static class ANode { int key, height; ANode left, right; ANode(int k) { key = k; } }
    static int h(ANode n) { return n == null ? -1 : n.height; }
    static void upd(ANode n) { n.height = 1 + Math.max(h(n.left), h(n.right)); }
    static ANode rotR(ANode y) { ANode x = y.left; y.left = x.right; x.right = y; upd(y); upd(x); return x; }
    static ANode rotL(ANode x) { ANode y = x.right; x.right = y.left; y.left = x; upd(x); upd(y); return y; }
    static ANode avlInsert(ANode n, int key) {
        if (n == null) return new ANode(key);
        if (key < n.key) n.left = avlInsert(n.left, key); else if (key > n.key) n.right = avlInsert(n.right, key); else return n;
        upd(n);
        int bf = h(n.left) - h(n.right);
        if (bf > 1)  { if (h(n.left.left) < h(n.left.right)) n.left = rotL(n.left); return rotR(n); }
        if (bf < -1) { if (h(n.right.right) < h(n.right.left)) n.right = rotR(n.right); return rotL(n); }
        return n;
    }

    public static void main(String[] args) {
        System.out.printf("%8s | %12s %10s %8s | %12s %10s %8s%n", "n", "BST height", "build ms", "steps", "AVL height", "build ms", "steps");
        for (int n = 5_000; n <= 40_000; n *= 2) {
            long t = System.nanoTime();
            BNode b = null;
            for (int i = 0; i < n; i++) b = bstInsert(b, i);          // sorted input
            long tb = (System.nanoTime() - t) / 1_000_000;

            t = System.nanoTime();
            ANode a = null;
            for (int i = 0; i < n; i++) a = avlInsert(a, i);
            long ta = (System.nanoTime() - t) / 1_000_000;

            int steps = 0;
            for (ANode c = a; c != null; c = (n - 1) < c.key ? c.left : c.right) { steps++; if (c.key == n - 1) break; }
            System.out.printf("%,8d | %12d %10d %8d | %12d %10d %8d%n", n, bstHeight(b), tb, bstSteps(b, n - 1), h(a), ta, steps);
        }
        System.out.println("AVL height stays close to log2 n (13-15 here) whatever the insertion order.");
    }
}
