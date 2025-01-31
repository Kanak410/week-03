package stackAndQueue.slidingwindow;

import java.util.*;

public class DequeSlidingW {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];  // Array to store max values
        Deque<Integer> deque = new LinkedList<>();  // Deque to store indices

        for (int i = 0; i < n; i++) {
            // Remove elements not in the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element index
            deque.offer(i);

            // Start storing results only when the first window is complete
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }

        }
            return result;
        }

        public static void main(String[] args) {


            int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;
            int[] maxValues = maxSlidingWindow(nums, k);

            System.out.println("Sliding Window Maximum: " + Arrays.toString(maxValues));
        }

}
