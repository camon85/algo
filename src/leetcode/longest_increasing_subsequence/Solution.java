package leetcode.longest_increasing_subsequence;

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1); // 1 <= nums.length <= 2500
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution.lengthOfLIS(nums1)); // 4

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println(solution.lengthOfLIS(nums2)); // 4

        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(solution.lengthOfLIS(nums3));  // 1

        int[] nums4 = {0, 1, 0, 3, 2, 3};
        System.out.println(solution.lengthOfLIS(nums4));  // 1

    }
}