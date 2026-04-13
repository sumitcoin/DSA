package Top20Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveEmptyNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sumit","Amrita","Shourya","Jack"," ", null);

        List filterNames = names.stream()
                .filter(Objects::nonNull)
                .filter(a -> !a.isBlank()).collect(Collectors.toList());

        System.out.println(filterNames);
    }
}
