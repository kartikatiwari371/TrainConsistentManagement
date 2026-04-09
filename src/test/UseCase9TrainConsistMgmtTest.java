package test;

import main.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    private List<Bogie> getBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("Sleeper", 75),
                new Bogie("AC Chair", 70),
                new Bogie("First Class", 50)
        );
    }

    @Test
    void testGrouping_BogiesGroupedByType() {
        UseCase9TrainConsistMgmt obj = new UseCase9TrainConsistMgmt();
        Map<String, List<Bogie>> result = obj.groupBogies(getBogies());

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        UseCase9TrainConsistMgmt obj = new UseCase9TrainConsistMgmt();
        Map<String, List<Bogie>> result = obj.groupBogies(getBogies());

        assertEquals(3, result.keySet().size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        UseCase9TrainConsistMgmt obj = new UseCase9TrainConsistMgmt();
        Map<String, List<Bogie>> result = obj.groupBogies(new ArrayList<>());

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        UseCase9TrainConsistMgmt obj = new UseCase9TrainConsistMgmt();
        Map<String, List<Bogie>> result = obj.groupBogies(getBogies());

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        UseCase9TrainConsistMgmt obj = new UseCase9TrainConsistMgmt();
        Map<String, List<Bogie>> result = obj.groupBogies(getBogies());

        assertEquals(2, result.get("Sleeper").size());
        assertEquals(1, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = getBogies();

        UseCase9TrainConsistMgmt obj = new UseCase9TrainConsistMgmt();
        obj.groupBogies(original);

        assertEquals(4, original.size());
    }
}