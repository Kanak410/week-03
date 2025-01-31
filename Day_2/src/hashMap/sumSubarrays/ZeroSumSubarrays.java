package hashMap.sumSubarrays;

import java.util.*;

public class ZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();  // Stores subarray indices
        Map<Integer, List<Integer>> map = new HashMap<>();  // Cumulative sum map
        int sum = 0;

        // Initialize the map with sum 0 at index -1 (for cases where sum itself is zero)
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Compute cumulative sum

            // If the sum has been seen before, all subarrays from those indices to i have sum 0
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    // Store subarray indices
                    result.add(new int[]{start + 1, i});
                }
            }

            // Store index for this cumulative sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        System.out.println("Zero Sum Subarrays:");
        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}

