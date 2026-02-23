package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        int key = 6;

        // Linear search
        System.out.println("Linear Search: " + list.contains(key));

        // Binary search using Collections.binarySearch
        // (list must be sorted)
        int index = Collections.binarySearch(list, key);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
