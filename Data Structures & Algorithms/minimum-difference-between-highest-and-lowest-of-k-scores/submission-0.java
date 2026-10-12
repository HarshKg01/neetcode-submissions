class Solution {
    public int minimumDifference(int[] nums, int k) {
        // Base case: If k is 1, the difference between the max and min of 1 element is 0
        if (k == 1) {
            return 0;
        }
        
        // 1. Sort the scores so closest values are adjacent
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
        
        // 2. Slide a window of size k across the array
        // The window starts at 'i' and ends at 'i + k - 1'
        for (int i = 0; i <= nums.length - k; i++) {
            int currentDiff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, currentDiff);
        }
        
        return minDiff;
    }
}
