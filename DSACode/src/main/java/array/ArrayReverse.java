package array;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int arr[] = {1,4,6,4,2,7,9};
        arr = Arrays.stream(arr)
                .boxed()                        //Convert int into Integer
                .sorted((a ,b) -> a - b)        // short in decending order
                .mapToInt(Integer::intValue)    // Convert back to int
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}

