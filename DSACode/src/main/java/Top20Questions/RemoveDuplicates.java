package Top20Questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        Set set = new LinkedHashSet();
        for (int i = 0; i< arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

        for(int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }
}
