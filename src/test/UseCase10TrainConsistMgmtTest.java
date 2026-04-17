package test;

import main.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    private List<Bogie> getBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 70),
                new Bogie("First Class", 50)
        );
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        UseCase10TrainConsistMgmt obj = new UseCase10TrainConsistMgmt();
        int total = obj.totalCapacity(getBogies());

        assertEquals(200, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        UseCase10TrainConsistMgmt obj = new UseCase10TrainConsistMgmt();
        int total = obj.totalCapacity(getBogies());

        assertTrue(total > 0);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        UseCase10TrainConsistMgmt obj = new UseCase10TrainConsistMgmt();

        List<Bogie> single = Arrays.asList(
                new Bogie("Sleeper", 80)
        );

        int total = obj.totalCapacity(single);

        assertEquals(80, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        UseCase10TrainConsistMgmt obj = new UseCase10TrainConsistMgmt();

        int total = obj.totalCapacity(new ArrayList<>());

        assertEquals(0, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        UseCase10TrainConsistMgmt obj = new UseCase10TrainConsistMgmt();

        int total = obj.totalCapacity(getBogies());

        assertEquals(200, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = getBogies();

        UseCase10TrainConsistMgmt obj = new UseCase10TrainConsistMgmt();
        obj.totalCapacity(original);

        assertEquals(3, original.size());
    }
}