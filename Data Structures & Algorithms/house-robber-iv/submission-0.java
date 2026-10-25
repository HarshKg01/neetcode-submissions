class Solution {
    public int minCapability(int[] nums, int k) {
        int low = nums[0];
        int high = nums[0];

        for (int i = 1; i < nums.length; i++) {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int count = 0;
            int i = 0;

            while (i < nums.length) {
                if (nums[i] <= mid) {
                    count++;
                    i += 2;
                } else {
                    i++;
                }
            }

            if (count >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}