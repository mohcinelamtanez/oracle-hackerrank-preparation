package org.example.day03.StackPattern;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author USER
 **/
public class Solution1 {

    public static boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Parenthèse ouvrante
            if (c == '(' || c == '[' || c == '{') {

                stack.push(c);

            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
