package main;

import java.util.*;

class GoodsBogie {
    String type;   // Cylindrical, Open, Box
    String cargo;  // Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class UseCase12TrainConsistMgmt {

    public boolean isSafe(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );
    }
}