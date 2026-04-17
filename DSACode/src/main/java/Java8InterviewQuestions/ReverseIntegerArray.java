package Java8InterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

// Reverse an integer array
public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        int[] reverseArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

        System.out.println(Arrays.toString(reverseArray));
    }
}
