class Solution {
    public int maxWidthRamp(int[] nums) {
        int maxlength = 0;
       
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]<=nums[j]){
                    maxlength = Math.max(j-i,maxlength);
                }
            }
        }
        return maxlength;
    }
}
