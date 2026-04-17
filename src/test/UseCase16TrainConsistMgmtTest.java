package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16TrainConsistMgmtTest {

    UseCase16TrainConsistMgmt obj = new UseCase16TrainConsistMgmt();

    @Test
    void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};
        int[] sorted = obj.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, sorted);
    }

    @Test
    void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};
        int[] sorted = obj.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, sorted);
    }

    @Test
    void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};
        int[] sorted = obj.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 56, 72}, sorted);
    }

    @Test
    void testSort_SingleElementArray() {
        int[] arr = {50};
        int[] sorted = obj.bubbleSort(arr);

        assertArrayEquals(new int[]{50}, sorted);
    }

    @Test
    void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};
        int[] sorted = obj.bubbleSort(arr);

        assertArrayEquals(new int[]{40, 40, 40}, sorted);
    }
}