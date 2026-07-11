package org.example.day01.HashMap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author USER
 **/
public class containsDuplicate {

    public static Boolean containsDuplicate(int[] nums){

        Set<Integer> seen = new HashSet<>() ;



        for(int i = 0 ; i <nums.length ; i++) {

          int elem = nums[i] ;

           if(seen.contains(elem)){
               return true ;
           }
               seen.add(elem);

       }
  return false ;
    }
}
