public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length-1);
    }

    /*
     * ---------------------------------------
     * Helper functions
     * ---------------------------------------
     * */

    void quickSort(int[] a, int begin, int end) {
        // recursive function: we keep partitioning the array until it is sorted
        if (begin < end) {
            int pivotInd = pivot(a, begin, end);
            quickSort(a, begin, pivotInd-1);
            quickSort(a, pivotInd+1, end);
        }
    }

    int pivot(int[] a, int begin, int end) {
        // this function returns a pivot point for a quickSort function
        int pivot = a[end];
        int i = (begin-1);

        // updating the pivot index
        for (int j = begin; j < end; j++) {
            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // swapping the found pivot point with a default chosen one
        int swapTemp = a[i+1];
        a[i+1] = a[end];
        a[end] = swapTemp;

        return i+1;
    }
}
