/*
 *  Merge sort is a divide and conquer algorithm that divides the array into two halves, sorts them recursively and then merges the sorted halves back together.
 *  This algorithm has a time complexity of O(n log n) in the worst, average and best case, making it more efficient than the previous algorithms mentioned.
 *  It's more efficient on large data sets and also it's a stable sorting algorithm which means that it preserves the order of elements with equal values.
 */


public class mergeSort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };
        mergeSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
