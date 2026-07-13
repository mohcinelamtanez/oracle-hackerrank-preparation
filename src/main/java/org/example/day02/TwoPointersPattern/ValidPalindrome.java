package org.example.day02.TwoPointersPattern;


/**
 * @author USER
 **/
public class ValidPalindrome {

    public static boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {


            if (s.charAt(left)!= s.charAt(right)) {
                return false ;
            }

            left++ ;
            right--;

        }
        return true ;
    }

}