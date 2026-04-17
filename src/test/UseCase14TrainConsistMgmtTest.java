package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmtTest {

    @Test
    void testException_ValidCapacityCreation() throws InvalidCapacityException {
        Bogie b = new Bogie("Sleeper", 80);
        assertEquals(80, b.getCapacity());
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Sleeper", -10);
        });
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Sleeper", 0);
        });
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception ex = assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Sleeper", 0);
        });

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        Bogie b = new Bogie("AC Chair", 70);

        assertEquals("AC Chair", b.getName());
        assertEquals(70, b.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws InvalidCapacityException {
        Bogie b1 = new Bogie("Sleeper", 80);
        Bogie b2 = new Bogie("AC Chair", 70);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}