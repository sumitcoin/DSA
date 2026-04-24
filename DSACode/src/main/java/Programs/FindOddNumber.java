package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find all add number from list
public class FindOddNumber {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(3,4,5,6,7,8,11,12,14,15);

        List<Integer> oddNumber = numList.stream().filter(a -> a % 2 ==0).collect(Collectors.toList());

        System.out.println(oddNumber);
    }
}
