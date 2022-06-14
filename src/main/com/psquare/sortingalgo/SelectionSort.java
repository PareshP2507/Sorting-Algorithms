package main.com.psquare.sortingalgo;

/**
 * SelectionSort is the simplest sorting algorithm.
 *
 * Consider an example in which you list of cards that you need to sort. By selection sort method it goes this way:
 * 1) Find the smallest card. Swap it with the first card.
 * 2) Find the second-smallest card. Swap it with the second card.
 * 3) Find the third-smallest card. Swap it with the third card.
 * 4) Repeat finding the next-smallest card, and swapping it into the correct position until the array is sorted.
 */
public class SelectionSort extends BaseSort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfMin = findMinIndex(array, i);
            swap(array, i, indexOfMin);
        }
    }

    private void swap(int[] array, int firstPosition, int secondPosition) {
        int tempValue = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = tempValue;
    }

    private int findMinIndex(int[] array, int startIndex) {
        int minIndex = startIndex;
        int minValue = array[minIndex];
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
