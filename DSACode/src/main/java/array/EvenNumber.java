package array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,22,15,33,49,98,32);

        list.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

        /** When number are given in Int*/
        int[] arr = {10,15,8,59,25,95,32};
        Map<Boolean, List<Integer>> mapList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(mapList);
    }
}
