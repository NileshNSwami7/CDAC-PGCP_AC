package BinarySearchTree;

/**
 * Day 6 - Binary search on a SORTED array.
 * Compare with the middle element and discard half of the remaining range every step.
 * At most floor(log2 n) + 1 comparisons  -> O(log n).
 */
public class BinarySearch {

    static int steps;

    static int iterative(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            steps++;
            int mid = lo + (hi - lo) / 2;         // NOT (lo + hi) / 2: that can overflow int for huge arrays
            if (a[mid] == key) return mid;
            if (key < a[mid]) hi = mid - 1;       // key is in the left half
            else lo = mid + 1;                    // key is in the right half
        }
        return -1;
    }

    static int recursive(int[] a, int key, int lo, int hi) {
        if (lo > hi) return -1;
        steps++;
        int mid = lo + (hi - lo) / 2;
        if (a[mid] == key) return mid;
        return key < a[mid] ? recursive(a, key, lo, mid - 1) : recursive(a, key, mid + 1, hi);
    }

    // Variant: FIRST index with a[i] >= key (lower bound). Useful with duplicates and for "insert position".
    static int lowerBound(int[] a, int key) {
        int lo = 0, hi = a.length;                 // answer can be a.length
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < key) lo = mid + 1; else hi = mid;
        }
        return lo;
    }

    static void trace(int[] a, int key) {
        System.out.println("search " + key + " in " + java.util.Arrays.toString(a));
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            System.out.printf("  lo=%d hi=%d mid=%d a[mid]=%d -> ", lo, hi, mid, a[mid]);
            if (a[mid] == key) { System.out.println("FOUND at " + mid); return; }
            if (key < a[mid]) { System.out.println(key + " < " + a[mid] + ", go left"); hi = mid - 1; }
            else { System.out.println(key + " > " + a[mid] + ", go right"); lo = mid + 1; }
        }
        System.out.println("  lo > hi -> NOT FOUND (it would be inserted at index " + lo + ")");
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        trace(a, 23);
        trace(a, 60);

        int[] dup = {1, 3, 3, 3, 3, 7, 9};
        System.out.println("\nwith duplicates " + java.util.Arrays.toString(dup) + ": iterative finds 3 at index " + iterative(dup, 3)
                + ", lowerBound(3) = " + lowerBound(dup, 3) + " (the FIRST 3), count of 3s = " + (lowerBound(dup, 4) - lowerBound(dup, 3)));

        System.out.println("\nworst-case comparisons (key absent, larger than everything):");
        for (int n = 1_000; n <= 10_000_000; n *= 10) {
            int[] big = new int[n];
            for (int i = 0; i < n; i++) big[i] = 2 * i;
            steps = 0; iterative(big, Integer.MAX_VALUE);
            System.out.printf("  n = %,13d   binary search steps = %2d   (log2 n = %.1f)   linear search would need %,d%n",
                    n, steps, Math.log(n) / Math.log(2), n);
        }
    }
}
