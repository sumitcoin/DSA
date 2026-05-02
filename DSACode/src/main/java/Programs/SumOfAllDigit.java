package Programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//
public class SumOfAllDigit {
    public static void main(String[] args) {
        Integer num = 12345;

        Integer sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sum);
    }
}
