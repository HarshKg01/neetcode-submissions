class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int maxcount = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
            else{
                maxcount = Math.max(count,maxcount);
                count = 1;
            }
        }
        
        maxcount = Math.max(count,maxcount);
        count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count++;
            }
            else{
                maxcount = Math.max(count,maxcount);
                count = 1;
            }
        }
        maxcount = Math.max(count,maxcount);
        return maxcount;
    }
}