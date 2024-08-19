package dsa.practice.hub.stack.hackerrank;

import java.util.*;

// https://www.hackerrank.com/challenges/waiter/problem
public class Waiter {

    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> result = new ArrayList<>();
        List<Integer> primes = generatePrimes(q); // Generate first q prime numbers

        List<Integer> currentPlates = new ArrayList<>(number);

        for (int i = 0; i < q; i++) {
            int prime = primes.get(i);
            Stack<Integer> A = new Stack<>();
            Stack<Integer> B = new Stack<>();

            // Divide plates into stacks A and B
            for (int j = currentPlates.size() - 1; j >= 0; j--) {
                int plate = currentPlates.get(j);
                if (plate % prime == 0) {
                    B.push(plate); // Divisible by the prime
                } else {
                    A.push(plate); // Not divisible by the prime
                }
            }

            // Append plates from stack B to result (in order they are popped)
            while (!B.isEmpty()) {
                result.add(B.pop());
            }

            // Update currentPlates to the content of stack A
            currentPlates = new ArrayList<>(A);
        }

        // Finally, append any remaining plates in stack A to the result
        while (!currentPlates.isEmpty()) {
            result.add(currentPlates.remove(currentPlates.size() - 1));
        }

        return result;
    }

    private static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
