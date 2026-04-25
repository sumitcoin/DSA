package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Get Three Maximum and Three Minimum number from list.
public class ThreeMaxAndMin {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(4, 5, 6, 7, 8, 10, 11, 14, 15, 17, 19, 20, 33);

        List<Integer> minThree = intList.stream().sorted().limit(3).collect(Collectors.toList());

        List<Integer> maxThree = intList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        System.out.println("Maximum Three number ::"+maxThree);

        System.out.println("Minimum Three number ::"+minThree);
    }
}
