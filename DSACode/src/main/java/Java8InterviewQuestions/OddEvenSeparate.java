package Java8InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of integers, separate odd and even numbers?
public class OddEvenSeparate {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(33,44,55,4,6,8,7,9,11,23,22);

        Map<Boolean, List<Integer>> oddEvenSeparation = listOfInteger.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        for(Boolean key :oddEvenSeparation.keySet()) {
            if(key) {
                System.out.println("All Even Number ::"+oddEvenSeparation.get(key));
            } else {
                System.out.println("All Odd Number ::"+oddEvenSeparation.get(key));
            }
        }
    }
}
