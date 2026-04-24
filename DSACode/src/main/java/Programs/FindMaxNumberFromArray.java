package Programs;

import java.util.Arrays;
import java.util.List;

//Find Max numbers from Integer list
public class FindMaxNumberFromArray {
    public static void main(String[] args) {
        List <Integer> numList = Arrays.asList(3,5,8,1,4,9,10,55,111,22,43,56);

        Integer maxInt = numList.stream().mapToInt(Integer::intValue).max().orElseThrow();

        System.out.println(maxInt);
    }
}
