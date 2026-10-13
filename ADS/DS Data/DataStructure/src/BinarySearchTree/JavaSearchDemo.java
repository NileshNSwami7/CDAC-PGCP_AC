package BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * Day 6 - Searching with the JDK.
 */
public class JavaSearchDemo {
    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // 1. Arrays.binarySearch: index if found, otherwise -(insertionPoint) - 1
        System.out.println("Arrays.binarySearch(a, 23) = " + Arrays.binarySearch(a, 23));
        int r = Arrays.binarySearch(a, 60);
        System.out.println("Arrays.binarySearch(a, 60) = " + r + "  -> not found, insertion point = -(" + r + ") - 1 = " + (-r - 1));

        // 2. On UNSORTED data the result is undefined (often wrong, no exception!)
        int[] unsorted = {38, 5, 91, 12, 2, 72, 23};
        System.out.println("binarySearch on UNSORTED array for 38 -> " + Arrays.binarySearch(unsorted, 38) + "   (but 38 IS there, at index 0!)");

        // 3. Linear search built in: List.indexOf / contains  (O(n), uses equals())
        List<String> names = new ArrayList<>(List.of("Zoya", "Arjun", "Meera", "Kabir"));
        System.out.println("indexOf(\"Meera\") = " + names.indexOf("Meera") + "  (linear, O(n))");

        // 4. Collections.binarySearch on a sorted List
        Collections.sort(names);
        System.out.println("sorted " + names + ", Collections.binarySearch(\"Meera\") = " + Collections.binarySearch(names, "Meera"));

        // 5. Search in a range: sorted structure answers "nearest" questions in O(log n)
        TreeMap<Integer, String> grades = new TreeMap<>();
        grades.put(0, "F"); grades.put(40, "D"); grades.put(55, "C"); grades.put(70, "B"); grades.put(85, "A");
        for (int marks : new int[]{38, 55, 69, 92})
            System.out.println("marks " + marks + " -> grade " + grades.floorEntry(marks).getValue() + "   (floorEntry: largest key <= marks)");
    }
}
