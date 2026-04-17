package main;

import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public boolean binarySearch(String[] bogieIds, String key) {

        if (bogieIds.length == 0) return false;

        // Ensure sorted (important requirement)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                return true; // found
            } else if (cmp > 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }
}