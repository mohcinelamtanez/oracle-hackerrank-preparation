package org.example.day02.TwoPointersPattern;


/**
 * @author USER
 **/
public class Solution2 {

    public static Boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char leftElem = s.charAt(left);
            char rightElem = s.charAt(right);

            if (leftElem != rightElem) {
                return false ;
            }

            left++ ;
            right--;

        }
        return true ;
    }

}