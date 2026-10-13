package BinarySearchTree;

/**
 * Day 6 - Sequential (linear) search and its analysis.
 * Works on ANY data: unsorted arrays, linked lists, files.
 *   best    : 1 comparison            (key at the front)          O(1)
 *   worst   : n comparisons           (key at the end / absent)   O(n)
 *   average : (n+1)/2 if present      O(n)
 */
public class SequentialSearch {

    static long comparisons;

    static int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            comparisons++;
            if (a[i] == key) return i;
        }
        return -1;
    }

    // Sentinel version: put the key at the end so the loop needs only ONE test per step
    // (no "i < n" check). Old but classic optimisation.
    static int sentinelSearch(int[] a, int n, int key) {       // a has room for one extra element at a[n]
        int last = a[n - 1];
        a[n - 1] = key;                                          // plant the sentinel
        int i = 0;
        while (a[i] != key) { i++; comparisons++; }
        comparisons++;
        a[n - 1] = last;                                         // restore
        if (i < n - 1 || last == key) return i;
        return -1;
    }

    // On a sorted array we can stop early once we pass where the key would be
    static int sortedEarlyExit(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            comparisons++;
            if (a[i] == key) return i;
            if (a[i] > key) return -1;                           // passed it: cannot be further on
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = i * 2;                // 0, 2, 4, ... (sorted, even numbers)

        comparisons = 0; search(a, 0);       System.out.println("best    (key first)       : " + comparisons + " comparison");
        comparisons = 0; search(a, 1998);    System.out.println("worst   (key last)        : " + comparisons);
        comparisons = 0; search(a, 7);       System.out.println("worst   (key absent)      : " + comparisons);
        long total = 0;
        for (int i = 0; i < n; i++) { comparisons = 0; search(a, a[i]); total += comparisons; }
        System.out.println("average (present, uniform): " + (double) total / n + "   formula (n+1)/2 = " + (n + 1) / 2.0);

        comparisons = 0; sentinelSearch(a, n, 1500);
        System.out.println("sentinel search for 1500  : found, " + comparisons + " comparisons (but only ONE test per loop step)");
        comparisons = 0; sortedEarlyExit(a, 7);
        System.out.println("sorted early exit, key 7  : " + comparisons + " comparisons instead of " + n);
    }
}
