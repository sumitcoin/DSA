package Top20Questions;

public class LargestElement {
    //Find Largest Elements in Array
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 99, 34};
        int max = arr[0];

        for(int num : arr) {
            if (num > max) max = num;
        }
        System.out.println(max);
    }
}
