package main;

import java.util.*;

public class UseCase10TrainConsistMgmt {

    public int totalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);
    }
}