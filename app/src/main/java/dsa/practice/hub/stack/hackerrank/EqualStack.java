package dsa.practice.hub.stack.hackerrank;

import java.util.List;

// https://www.hackerrank.com/challenges/equal-stacks/problem
public class EqualStack {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int height1 = h1.stream().mapToInt(Integer::intValue).sum();
        int height2 = h2.stream().mapToInt(Integer::intValue).sum();
        int height3 = h3.stream().mapToInt(Integer::intValue).sum();

        boolean isSameHeight = height1 == height2 && height2 == height3;

        while (true) {
            if (h1.isEmpty() && h2.isEmpty() && h3.isEmpty()) {
                return 0;
            }
            if (isSameHeight) {
                return height1;
            }

            if (height1 >= height2 && height1 >= height3) {
                height1 -= h1.remove(0);
            } else if (height2 >= height1 && height2 >= height3) {
                height2 -= h2.remove(0);
            } else {
                height3 -= h3.remove(0);
            }
            isSameHeight = height1 == height2 && height2 == height3;
        }
    }
}
