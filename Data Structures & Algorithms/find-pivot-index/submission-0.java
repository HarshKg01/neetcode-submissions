class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int sumleft = 0;
        for(int i = 0;i<nums.length;i++){
            if(i>0){
            sumleft += nums[i-1];
            }
            int rightsum = sum - sumleft-nums[i];
            
            if(sumleft == rightsum){
                return i;
            }
            
        }
        return -1;
    }
}