package Programs;

import java.util.Arrays;
import java.util.List;

// Find minimum number from integer list
public class FindMinNumberFromList{
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(44,2,6,88,6,644,5,7,99);

        Integer minNumber = numList.stream().mapToInt(Integer::intValue).min().orElseThrow();

        System.out.println(minNumber);
    }
}
