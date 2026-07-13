package org.example.day03.StackPattern;

/**
 * @author USER
 **/
public class MaxSumSubArrayOfSizek {
    public  static int maxSumSubArrayOfSizek( int[] nums , int k ) {

        int currentSum =  0 ;

        for( int i = 0 ; i<k ; i++) {
            currentSum += nums[i] ;
        }

        int maxSum = currentSum ;

        int left = 0 ;
        int right = k ;

        while(right < nums.length ) {

            currentSum -= nums[left]  ;
            currentSum += nums[right] ;

            if(currentSum > maxSum) {
                maxSum = currentSum ;
            }

            left++ ;
            right++ ;
        }
        return maxSum  ;
    }
}
