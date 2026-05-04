package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringReverseOrder {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Sun","Moon","Health","Gun","fun","bun","oak");

        strList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

