/*
 * Quicksort is a divide-and-conquer algorithm that uses a pivot element to partition an array into smaller sub-arrays, and then recursively sorts the sub-arrays.
 * The pivot element is chosen such that all elements smaller than it come before all elements greater than it.
 * This algorithm has a time complexity of O(n log n) on average, making it more efficient than bubble and insertion sort.
 * It is not a stable algorithm, which means that the order of equal elements is not preserved.
 * It's efficient for large data sets and it's also efficient when the data set is randomly ordered.
 */


public class quickSort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };
        quickSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && array[--j] >= pivot);
            if (i < j) {
                array[i] = array[j];
            }

            while (i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j;
    }
}
