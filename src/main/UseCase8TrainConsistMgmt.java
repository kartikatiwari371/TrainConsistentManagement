package main;

import java.util.*;
import java.util.stream.*;

public class UseCase8TrainConsistMgmt {

    public List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }
}