package leetcode.maximumsubarray;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Output: " + maxSubArray(nums1));

        int[] nums2 = {1};
        System.out.println("Output: " + maxSubArray(nums2));

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Output: " + maxSubArray(nums3));
    }

    public static int maxSubArray(int[] nums) {
        int totalMax = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            totalMax = Math.max(currentMax, totalMax);
        }
        return totalMax;
    }
}

