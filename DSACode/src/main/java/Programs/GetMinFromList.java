package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetMinFromList {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(33,5,77,89,32,45,98,47);

        Integer num = intList.stream().min(Comparator.naturalOrder()).get();

        System.out.println(num);
    }
}
