package org.example.day01.HashMap;

import java.util.HashMap;

/**
 * @author USER
 **/

// string = mohcihne ; string ayoub ;
public class Solution3 {
    public static Boolean ValidAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);

            if (map.get(c) < 0) {
                return false;
            }

        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!(map.containsKey(c))) {
                return false;
            } else
                map.put(c, map.get(c) - 1);
        }
        for (int frequency : map.values()) {
            if (frequency != 0) {
                return false;
            }

        }
        return true;
    }
}