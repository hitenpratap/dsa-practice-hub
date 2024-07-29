package dsa.practice.hub.stack.hackerrank;

import java.util.List;
import java.util.Stack;

// https://www.hackerrank.com/challenges/largest-rectangle/problem
public class LargestRectangle {

    public static long largestRectangle(List<Integer> heights) {
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int index = 0;
        int size = heights.size();

        while (index < size) {
            if (stack.isEmpty() || heights.get(index) >= heights.get(stack.peek())) {
                stack.push(index++);
            } else {
                int top = stack.pop();
                long area = (long) heights.get(top)
                        * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            long area =
                    (long) heights.get(top) * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
