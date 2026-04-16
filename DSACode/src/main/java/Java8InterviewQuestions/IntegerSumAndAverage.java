package Java8InterviewQuestions;

import java.util.Arrays;

// Given an integer array, find sum and average of all elements?
public class IntegerSumAndAverage {
    public static void main(String[] args) {

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(a).sum();

        System.out.println("SUM ="+sum);

        double average = Arrays.stream(a).average().getAsDouble();

        System.out.println("Average ="+average);
    }
}
