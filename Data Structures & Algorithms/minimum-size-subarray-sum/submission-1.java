class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                length = i-j+1;
                minlength = Math.min(length,minlength);
                sum -= nums[j];
                j++;
            }
        }
        if(minlength == Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }
}