package Programs;

import java.util.Arrays;
import java.util.List;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] intList = {33,12,23,22,11,56,54,78};

        Integer sum = Arrays.stream(intList).sum();

        Double average = Arrays.stream(intList).average().getAsDouble();

        System.out.println(sum);

        System.out.println(average);
    }
}
