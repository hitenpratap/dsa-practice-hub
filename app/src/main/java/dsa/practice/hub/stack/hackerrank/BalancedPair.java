package dsa.practice.hub.stack.hackerrank;

import java.util.Stack;

// https://www.hackerrank.com/challenges/balanced-brackets/problem
public class BalancedPair {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ']' && top != '[')
                        || (c == ')' && top != '(')) {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
