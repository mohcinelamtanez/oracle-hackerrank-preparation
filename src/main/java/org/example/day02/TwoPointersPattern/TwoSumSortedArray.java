package org.example.day02.TwoPointersPattern;

/**
 * @author USER
 **/
public class TwoSumSortedArray {
    public static int[] twoSumSortedArray(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1  ;

        while (left < right) {

            int sum = left + right ;

            if (sum > target) {
                right--;
            } else if (sum< target) {
                left++;
            } else
                return new int[]{left + 1, right +1};


        }
        return new int[]{};
    }
}