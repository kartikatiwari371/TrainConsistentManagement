package main;

import java.util.Arrays;

public class UseCase20TrainConsistMgmt {

    public boolean searchBogie(String[] bogieIds, String key) {

        // 🔥 Fail-fast check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Optional: sort before binary search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) return true;
            else if (cmp > 0) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}