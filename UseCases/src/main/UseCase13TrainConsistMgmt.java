package main;

import java.util.*;
import java.util.stream.*;

public class UseCase13TrainConsistMgmt {

    // Loop-based filtering
    public List<Bogie> filterWithLoop(List<Bogie> bogies, int threshold) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > threshold) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream-based filtering
    public List<Bogie> filterWithStream(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    // Performance measurement
    public long measureLoopTime(List<Bogie> bogies, int threshold) {
        long start = System.nanoTime();
        filterWithLoop(bogies, threshold);
        long end = System.nanoTime();
        return end - start;
    }

    public long measureStreamTime(List<Bogie> bogies, int threshold) {
        long start = System.nanoTime();
        filterWithStream(bogies, threshold);
        long end = System.nanoTime();
        return end - start;
    }
}