package dsa.practice.hub.stack.hackerrank;

import java.util.Stack;
import java.util.List;

// https://www.hackerrank.com/challenges/and-xor-or/problem
public class AndXorOr {

    public static int andXorOr(List<Integer> a) {
        Stack<Integer> stack = new Stack<>();
        int maxXor = Integer.MIN_VALUE;

        for (int num : a) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                maxXor = Math.max(maxXor, num ^ top);

                // If the current number is less than or equal to the top of the stack,
                // it means we should pop the stack because the numbers are not increasing.
                if (num <= top) {
                    stack.pop();
                } else {
                    break;
                }
            }
            stack.push(num);
        }

        return maxXor;
    }
}
