package org.example;

import org.example.day03.StackPattern.MaxSumSubArrayOfSizek;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int nums[] = { 1 , 3 , 5 , 9 , 2 , 4} ;

        // System.out.println(Arrays.toString(Solution1.twoSumSortedArray(nums , 6)))  ;
        char[] t = {'m','o','h','c','i','n' , 'e'} ;
 // System.out.println(Solution3.reverseString(t)) ;
       /* System.out.println(Solution4.removeDuplicate(nums));
        System.out.println(Arrays.toString(nums)) ;*/

        //System.out.println(Solution1.isValid("{(())}"));
        System.out.println(MaxSumSubArrayOfSizek.maxSumSubArrayOfSizek(nums , 2));
    }
}
