package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetMaxFromList {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(33,5,77,89,32,45,98,47);

        Integer num = intList.stream().max(Comparator.naturalOrder()).get();

        System.out.println(num);
    }
}
