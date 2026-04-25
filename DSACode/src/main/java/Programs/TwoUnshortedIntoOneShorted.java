package Programs;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Merge two unshortted array into one shorted array.
public class TwoUnshortedIntoOneShorted {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(4, 5, 6, 7, 8, 10, 11, 14, 15, 17, 19, 20, 33);
        List<Integer> b = Arrays.asList(5, 6, 7, 3, 4, 7, 8, 9, 11, 23, 44, 54, 67, 89);

        List<Integer> sortedArray = Stream.concat(a.stream(), b.stream()).sorted().collect(Collectors.toList());

        System.out.println(sortedArray);
    }
}
