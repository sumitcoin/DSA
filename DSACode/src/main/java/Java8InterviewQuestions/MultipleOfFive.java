package Java8InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// From the given list of integers, print the numbers which are multiples of 5?
public class MultipleOfFive {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);

        List<Integer> list = listOfIntegers.stream().filter(i -> i%5 == 0).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        for(Integer n: listOfIntegers) {
            if(n%5 == 0) {
                list2.add(n);
            }
        }
        System.out.println(list2);
    }
}
