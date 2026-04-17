package main;

import java.util.*;

public class UseCase7TrainConsistMgmt {

    public List<Bogie> sortBogies(List<Bogie> bogies) {
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        return bogies;
    }
}