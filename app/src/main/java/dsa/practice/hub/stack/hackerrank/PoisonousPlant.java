package dsa.practice.hub.stack.hackerrank;

import java.util.List;
import java.util.Stack;

// https://www.hackerrank.com/challenges/poisonous-plants/problem
public class PoisonousPlant {

    public static int poisonousPlants(List<Integer> p) {
        int n = p.size();
        int[] days = new int[n];
        Stack<Integer> stack = new Stack<>();
        int maxDays = 0;

        for (int i = 0; i < n; i++) {
            int maxDaysForCurrent = 0;
            while (!stack.isEmpty() && p.get(stack.peek()) >= p.get(i)) {
                maxDaysForCurrent = Math.max(maxDaysForCurrent, days[stack.pop()]);
            }
            if (!stack.isEmpty()) {
                days[i] = maxDaysForCurrent + 1;
            }
            stack.push(i);
            maxDays = Math.max(maxDays, days[i]);
        }

        return maxDays;
    }
}
