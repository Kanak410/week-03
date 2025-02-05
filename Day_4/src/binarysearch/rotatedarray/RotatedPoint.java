package binarysearch.rotatedarray;

public class RotatedPoint {

        public static int findRotationPoint(int[] arr) {
            int left = 0, right = arr.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] > arr[right]) {
                    // Rotation point is in the right half
                    left = mid + 1;
                } else {
                    // Rotation point is in the left half (including mid)
                    right = mid;
                }
            }

            return left; // Index of the smallest element (rotation point)
        }

        public static void main(String[] args) {
            int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
            int rotationIndex = findRotationPoint(arr);
            System.out.println("Rotation point is at index: " + rotationIndex + " with value: " + arr[rotationIndex]);
        }


}
