/*
 * insertion sort is a simple sorting algorithm that builds the final sorted list one item at a time.
 *  It compares each element with the one in front of it and swaps them if they are not in the correct order.
 *   has a time complexity of O(n^2) in the worst and average cases and O(n) in the best case which is when the array is already sorted
 *   making it more efficient than bubble sort.    
 *   It is efficient for small data sets and also efficient when the data set is already partially sorted.
 */
public class insertionSort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
