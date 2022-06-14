package com.psquare.sortingalgoTest;

import main.com.psquare.sortingalgo.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    private final SelectionSort selectionSort = new SelectionSort();

    @Test
    void test_ifGivenArray_withPositiveValues_IsSortedUsingSelectionSort() {
        int[] inputArray = {20, 11, 31, 1, 101, 34};
        int[] outputArray = {1, 11, 20, 31, 34, 101};
        selectionSort.sort(inputArray);
        Assertions.assertArrayEquals(inputArray, outputArray);
    }

    @Test
    void test_ifGivenArray_withMixValues_IsSortedUsingSelectionSort() {
        int[] inputArray = {20, -11, 0, 20, 101, 34};
        int[] outputArray = {-11, 0, 20, 20, 34, 101};
        selectionSort.sort(inputArray);
        Assertions.assertArrayEquals(inputArray, outputArray);
    }
}
