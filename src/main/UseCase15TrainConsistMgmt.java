import java.util.*;

public class UseCase15TrainConsistMgmt {

    public void assignCargoToBogies(List<GoodsBogie2> bogies, List<String> cargos) {

        for (int i = 0; i < bogies.size(); i++) {
            bogies.get(i).assignCargo(cargos.get(i));
        }
    }
}
