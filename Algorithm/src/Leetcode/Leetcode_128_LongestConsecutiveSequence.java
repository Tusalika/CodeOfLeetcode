package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) return 1;
        Set<Integer> nums_set = new HashSet<Integer>();
        for (int num : nums) {
            nums_set.add(num);
        }

        int longestStreak = 0;

        for (int num : nums_set) {
            if (!nums_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (nums_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
