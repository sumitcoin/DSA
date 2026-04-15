package Java8InterviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Find sum of all digits of a number in Java 8?
public class SumAllDigits {
    public static void main(String[] args) {
        int i = 156234;

        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sumOfDigits);
    }
}
