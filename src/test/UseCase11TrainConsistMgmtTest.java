package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmtTest {

    UseCase11TrainConsistMgmt obj = new UseCase11TrainConsistMgmt();

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(obj.validateTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(obj.validateTrainID("TRAIN12"));
        assertFalse(obj.validateTrainID("TRN12A"));
        assertFalse(obj.validateTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(obj.validateCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(obj.validateCargoCode("PET-ab"));
        assertFalse(obj.validateCargoCode("PET123"));
        assertFalse(obj.validateCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(obj.validateTrainID("TRN-123"));
        assertFalse(obj.validateTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(obj.validateCargoCode("PET-Ab"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(obj.validateTrainID(""));
        assertFalse(obj.validateCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(obj.validateTrainID("TRN-1234XYZ"));
        assertFalse(obj.validateCargoCode("PET-ABCD"));
    }
}