package main;

import java.util.*;

public class UseCase14TrainConsistMgmt {

    public List<Bogie> createBogies(List<String> names, List<Integer> capacities)
            throws InvalidCapacityException {

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            Bogie b = new Bogie(names.get(i), capacities.get(i));
            bogies.add(b);
        }

        return bogies;
    }
}