package dsa.practice.hub.stack.hackerrank;

import java.util.List;

// https://www.hackerrank.com/challenges/game-of-two-stacks/problem
public class GameOfTwoStack {

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int sum = 0, maxCount = 0;
        int i = 0, j = 0;

        // Remove elements from stack a and calculate prefix sums
        while (i < a.size() && sum + a.get(i) <= maxSum) {
            sum += a.get(i);
            i++;
        }
        maxCount = i;

        // Try removing elements from stack b
        while (j < b.size() && i >= 0) {
            sum += b.get(j);
            j++;
            while (sum > maxSum && i > 0) {
                i--;
                sum -= a.get(i);
            }
            if (sum <= maxSum && i + j > maxCount) {
                maxCount = i + j;
            }
        }

        return maxCount;
    }
}
