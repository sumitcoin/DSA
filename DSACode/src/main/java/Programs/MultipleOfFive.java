package Programs;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Get Multiple of 5 from Integer List
public class MultipleOfFive {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5,6,8,9,12,11,12,13,14,15,16,17,18,19);

        List<Integer> multipleOfFive = integerList.stream().filter(a -> a % 5 == 0).collect(Collectors.toList());

        System.out.println(multipleOfFive);

        multipleOfFive = IntStream.range(0, 100).filter(a -> a % 5 == 0).boxed().collect(Collectors.toList());

        System.out.println(multipleOfFive);
    }
}
