package DSA;

import java.util.Arrays;

/**
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Input nums = [0,1,0,3,12]
 * Output nums = [1,3,12,0,0]
 */
public class MoveZeros {
    public void moveZero(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j] == 0) {
                    int x = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = x;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void main(String[] args) {

        int[] intArr = {0,1,0,3,12};

        MoveZeros mz = new MoveZeros();
        mz.moveZero(intArr);
    }
}
