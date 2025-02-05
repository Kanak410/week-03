package challenges.findpositive;
import java.util.Arrays;
public class NumberAndTarget {




        // Function to find the first missing positive integer using Linear Search
        public static int findFirstMissingPositive(int[] nums) {
            int n = nums.length;

            // Step 1: Place numbers in their correct index positions
            for (int i = 0; i < n; i++) {
                while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                    // Swap nums[i] with nums[nums[i] - 1]
                    int temp = nums[i];
                    nums[i] = nums[temp - 1];
                    nums[temp - 1] = temp;
                }
            }

            // Step 2: Find the first missing positive integer
            for (int i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
            }

            return n + 1; // If all elements are present, return next positive number
        }

        // Function to perform Binary Search for a target number
        public static int binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid; // Target found, return index
                } else if (arr[mid] < target) {
                    left = mid + 1; // Search right half
                } else {
                    right = mid - 1; // Search left half
                }
            }

            return -1; // Target not found
        }

        public static void main(String[] args) {
            int[] nums = {3, 4, -1, 1};
            int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Sorted array for Binary Search
            int target = 6;

            // Find the first missing positive integer
            int missing = findFirstMissingPositive(nums);
            System.out.println("First missing positive integer: " + missing);

            // Perform Binary Search
            int index = binarySearch(sortedArray, target);
            if (index != -1) {
                System.out.println("Target " + target + " found at index: " + index);
            } else {
                System.out.println("Target " + target + " not found.");
            }
        }


}
