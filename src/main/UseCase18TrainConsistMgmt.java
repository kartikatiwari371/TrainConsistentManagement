package main;

public class UseCase18TrainConsistMgmt {

    public boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true; // found → stop immediately
            }
        }

        return false; // not found after full traversal
    }
}