package src.sortinglargedata;

import java.util.Arrays;

public class Merge {

        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
    }
        private static void merge(int[] arr, int left, int mid, int right) {
            int[] temp = Arrays.copyOfRange(arr, left, right + 1);
            int i = left, j = mid + 1, k = left;
            while (i <= mid && j <= right) {
                arr[k++] = (temp[i - left] <= temp[j - left]) ? temp[i++ - left] : temp[j++ - left];
            }
            while (i <= mid) arr[k++] = temp[i++ - left];
            while (j <= right) arr[k++] = temp[j++ - left];
        }
}
