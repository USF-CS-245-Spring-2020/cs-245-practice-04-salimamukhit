public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        mergeSort(a, a.length);
    }
    /*
    * ---------------------------------------
    * Helper functions
    * ---------------------------------------
    * */

    public void mergeSort(int[] arr, int n) {
        // base case
        if (n < 2) {
            return;
        }
        // splitting the array into halves
        int mid = n/2;
        int[] array1 = new int[mid];
        int[] array2 = new int[n-mid];
        // populating smaller arrays
        System.arraycopy(arr, 0, array1, 0, mid);
        System.arraycopy(arr, mid, array2, 0, n - mid);
        // calling recursive function
        mergeSort(array1, mid);
        mergeSort(array2, n-mid);
        // merging two arrays
        merge(arr, array1, array2, mid, n-mid);
    }


    public void merge(int[] arr, int[] left, int[] right, int leftLen, int rightLen) {
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < leftLen) {
            arr[k++] = left[i++];
        }

        while (j < rightLen) {
            arr[k++] = right[j++];
        }
    }
}
