package hashMap.longestsub;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {  // Start of a new sequence
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr));
    }
}

