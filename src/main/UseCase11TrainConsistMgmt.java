package main;

import java.util.regex.*;

public class UseCase11TrainConsistMgmt {

    private static final String TRAIN_REGEX = "TRN-\\d{4}";
    private static final String CARGO_REGEX = "PET-[A-Z]{2}";

    public boolean validateTrainID(String trainId) {
        if (trainId == null || trainId.isEmpty()) return false;
        return Pattern.matches(TRAIN_REGEX, trainId);
    }

    public boolean validateCargoCode(String cargoCode) {
        if (cargoCode == null || cargoCode.isEmpty()) return false;
        return Pattern.matches(CARGO_REGEX, cargoCode);
    }
}