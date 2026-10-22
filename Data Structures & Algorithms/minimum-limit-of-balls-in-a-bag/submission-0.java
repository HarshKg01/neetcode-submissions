class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int maxi = Integer.MIN_VALUE;
        for(int x : nums){
            maxi = Math.max(x,maxi);
        }
        if(maxi == 1){
            return 1;
        }
        int low = 1;
        int high = maxi;
        int ans = maxi;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int operations = 0;

            for (int x : nums) {
                operations += (x - 1) / mid;
            }

            if (operations <= maxOperations) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
