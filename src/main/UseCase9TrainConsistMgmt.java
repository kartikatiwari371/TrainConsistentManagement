package main;

import java.util.*;
import java.util.stream.*;

public class UseCase9TrainConsistMgmt {

    public Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }
}