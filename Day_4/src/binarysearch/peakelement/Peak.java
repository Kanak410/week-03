package binarysearch.peakelement;

public class Peak {

        public static int findPeakElement(int[] arr) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] > arr[mid + 1]) {

                    // The peak lies in the left half (including mid)
                    right = mid;
                } else {
                    // The peak lies in the right half
                    left = mid + 1;
                }
            }

            return left; // or return right, as left == right at the end
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 20, 4, 1, 0};
            int peakIndex = findPeakElement(arr);
            System.out.println("Peak element is at index: " + peakIndex + " with value: " + arr[peakIndex]);
        }



}
