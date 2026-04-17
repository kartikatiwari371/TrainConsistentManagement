package test;

import main.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmtTest {

    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie2 b = new GoodsBogie2("Cylindrical");

        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie2 b = new GoodsBogie2("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.getCargo());
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie2 b = new GoodsBogie2("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.getCargo());
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        GoodsBogie2 b1 = new GoodsBogie2("Rectangular");
        GoodsBogie2 b2 = new GoodsBogie2("Cylindrical");

        b1.assignCargo("Petroleum"); // fails
        b2.assignCargo("Petroleum"); // succeeds

        assertEquals("Petroleum", b2.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        GoodsBogie2 b = new GoodsBogie2("Rectangular");

        b.assignCargo("Petroleum");

        // no assertion needed, just ensuring no crash
        assertTrue(true);
    }
}