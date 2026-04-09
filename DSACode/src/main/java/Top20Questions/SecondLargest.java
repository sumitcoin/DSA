package Top20Questions;

public class SecondLargest {
    //Find Second Largest Element
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 30, 50};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println(second);
    }
}
