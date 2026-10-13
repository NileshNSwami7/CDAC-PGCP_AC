package BinarySearchTree;

import java.util.Arrays;
import java.util.Random;

/**
 * Day 6 - Linear vs binary search in real time, and the cost of sorting first.
 * Binary search needs sorted data. Sorting costs O(n log n) ONCE;
 * it pays off when you search many times.
 */
public class SearchComparison {

    static int linear(int[] a, int key) { for (int i = 0; i < a.length; i++) if (a[i] == key) return i; return -1; }

    public static void main(String[] args) {
        int n = 1_000_000, queries = 2_000;
        Random rnd = new Random(3);
        int[] data = rnd.ints(n, 0, 10 * n).toArray();
        int[] keys = rnd.ints(queries, 0, 10 * n).toArray();

        long t = System.nanoTime();
        int found1 = 0;
        for (int k : keys) if (linear(data, k) >= 0) found1++;
        long linMs = (System.nanoTime() - t) / 1_000_000;

        t = System.nanoTime();
        int[] sorted = data.clone();
        Arrays.sort(sorted);                                   // O(n log n), once
        long sortMs = (System.nanoTime() - t) / 1_000_000;

        t = System.nanoTime();
        int found2 = 0;
        for (int k : keys) if (Arrays.binarySearch(sorted, k) >= 0) found2++;
        long binMs = (System.nanoTime() - t) / 1_000_000;

        System.out.printf("n = %,d elements, %,d searches%n", n, queries);
        System.out.printf("  linear search           : %6d ms  (found %d)%n", linMs, found1);
        System.out.printf("  sort once (Arrays.sort) : %6d ms%n", sortMs);
        System.out.printf("  binary search           : %6d ms  (found %d)%n", binMs, found2);
        System.out.printf("  one linear search costs about %.2f ms; the sort pays for itself after ~%d searches%n",
                (double) linMs / queries, Math.max(1, Math.round(sortMs / ((double) linMs / queries))));
    }
}
