class Solution {
    public int majorityElement(int[] nums) {
        int maxelement = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                maxelement = nums[i];
                count++;
            }
            else if(nums[i] == maxelement){
                count++;
            }
            else{
                count--;
            }
        }
        return maxelement;
    }
}