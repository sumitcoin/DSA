package Java8InterviewQuestions;

import java.util.stream.IntStream;

// How do you find sum of first 10 natural numbers?
public class Sum10NaturalNumber {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 11).sum();

        System.out.println(sum);
    }
}
