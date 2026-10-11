class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean decrease = true;
        boolean increase = true;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                decrease = false;
            }
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                increase = false;
            }
        }
        if(decrease || increase){
            return true;
        }
        return false;
    }
}