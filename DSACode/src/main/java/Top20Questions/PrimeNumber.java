package Top20Questions;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 6;
        boolean isPrimeB = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrimeB = false;
                break;
            }
        }
        System.out.println(isPrimeB);


        // Java 8 Stream logic
        boolean isPrime = n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);

        System.out.println(isPrime);
    }
}
