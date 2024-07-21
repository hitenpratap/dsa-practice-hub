package dsa.practice.hub.stack.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://www.hackerrank.com/challenges/maximum-element/problem
public class MaxElementStack {

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (String operation : operations) {
            String[] parts = operation.split(" ");
            int type = Integer.parseInt(parts[0]);

            if (type == 1) {
                int value = Integer.parseInt(parts[1]);
                stack.push(value);
                if (maxStack.isEmpty() || value >= maxStack.peek()) {
                    maxStack.push(value);
                }
            } else if (type == 2) {
                if (!stack.isEmpty()) {
                    int removedValue = stack.pop();
                    if (removedValue == maxStack.peek()) {
                        maxStack.pop();
                    }
                }
            } else if (type == 3) {
                if (!maxStack.isEmpty()) {
                    result.add(maxStack.peek());
                }
            }
        }

        return result;
    }
}
