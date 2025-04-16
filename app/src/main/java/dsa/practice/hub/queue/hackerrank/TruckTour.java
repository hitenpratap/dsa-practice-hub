package dsa.practice.hub.queue.hackerrank;

import java.util.List;

// https://www.hackerrank.com/challenges/truck-tour/problem
public class TruckTour {

    public static int truckTour(List<List<Integer>> petrolPumps) {
        int totalSurplus = 0; // overall petrol surplus across all pumps
        int currentSurplus = 0; // petrol surplus on the current trial route
        int startIndex = 0; // candidate start pump

        for (int i = 0; i < petrolPumps.size(); i++) {
            int petrol = petrolPumps.get(i).get(0);
            int distance = petrolPumps.get(i).get(1);
            int diff = petrol - distance;

            totalSurplus += diff;
            currentSurplus += diff;

            // If at this point we cannot reach pump i+1 from startIndex,
            // none of the pumps between startIndex and i (inclusive) can be a valid start.
            if (currentSurplus < 0) {
                startIndex = i + 1; // try next pump as new start
                currentSurplus = 0; // reset surplus for the new trial
            }
        }

        // If totalSurplus >= 0, the trip is possible and startIndex is the answer.
        // Otherwise, no solution exists (per problem statement this won’t happen).
        return (totalSurplus >= 0) ? startIndex : -1;
    }
}
