package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Add two array and remove duplicate
public class AddTwoArrayAndRemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(3,5,6,7,8,3,9);
        List<Integer> arr2 = Arrays.asList(6,7,9,3,4,6,7);

        List<Integer> arr3 = Stream.concat(arr1.stream(), arr2.stream()).distinct().collect(Collectors.toList());

        System.out.println(arr3);
    }
}
