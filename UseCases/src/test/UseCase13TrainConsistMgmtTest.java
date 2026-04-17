package test;

import main.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    UseCase13TrainConsistMgmt obj = new UseCase13TrainConsistMgmt();

    private List<Bogie> getBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 70),
                new Bogie("First Class", 50),
                new Bogie("General", 65)
        );
    }

    private List<Bogie> largeDataset() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(new Bogie("Type" + i, i % 100));
        }
        return list;
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = obj.filterWithLoop(getBogies(), 60);
        assertTrue(result.stream().allMatch(b -> b.getCapacity() > 60));
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = obj.filterWithStream(getBogies(), 60);
        assertTrue(result.stream().allMatch(b -> b.getCapacity() > 60));
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> loopResult = obj.filterWithLoop(getBogies(), 60);
        List<Bogie> streamResult = obj.filterWithStream(getBogies(), 60);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long loopTime = obj.measureLoopTime(getBogies(), 60);
        long streamTime = obj.measureStreamTime(getBogies(), 60);

        assertTrue(loopTime > 0);
        assertTrue(streamTime > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> large = largeDataset();

        List<Bogie> result = obj.filterWithStream(large, 60);

        assertNotNull(result);
    }
}