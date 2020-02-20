public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        // iterating through the array
        for (int i = 1; i < a.length; ++i) {
            // setting temporary value to values of each index in the array
            int temp = a[i];
            // previous element to be compared with
            int j = i - 1;
            // here we move the elements to have space for temp that we will insert
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            // inserting a[i]
            a[j + 1] = temp;
        }
    }
}
