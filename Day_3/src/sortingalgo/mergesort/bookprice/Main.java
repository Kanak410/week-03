package sortingalgo.mergesort.bookprice;

public class Main {
    public void mergeSort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;

        // Recursively divide the array
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        // Merge the divided parts
        merge(arr, s, mid, e);
    }

    public void merge(int arr[], int s, int mid, int e) {
        int leftSize = mid - s + 1;
        int rightSize = e - mid;

        int left[] = new int[leftSize];
        int right[] = new int[rightSize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[s + i];
        }
        for (int j = 0; j < rightSize; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = s;

        // Merge two sorted subarrays
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left subarray
        while (i < leftSize) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right subarray
        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

       Main sorter = new Main();
        sorter.mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
