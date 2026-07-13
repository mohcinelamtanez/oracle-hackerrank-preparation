package org.example.day02.TwoPointersPattern;

/**
 * @author USER
 **/
public class RemoveDuplicate {

    public static int removeDuplicate(int[] nums) {
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                right++;
            } else {
                left++;
                nums[left] = nums[right];
                right++;
            }

        }
        return left + 1;
    }

}