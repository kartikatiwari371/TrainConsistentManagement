package test;

import main.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    private List<Bogie> getBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 70),
                new Bogie("First Class", 50)
        );
    }

    @Test
    void testFilter() {
        UseCase8TrainConsistMgmt obj = new UseCase8TrainConsistMgmt();
        List<Bogie> result = obj.filterBogies(getBogies(), 70);

        assertEquals(1, result.size());
        assertEquals(80, result.get(0).getCapacity());
    }
}