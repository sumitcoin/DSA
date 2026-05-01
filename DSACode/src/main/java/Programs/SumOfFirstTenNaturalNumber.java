package Programs;

import java.util.stream.IntStream;

public class SumOfFirstTenNaturalNumber {
    public static void main(String[] args) {
        int a = IntStream.range(1, 11).sum();

        System.out.println(a);
    }
}
