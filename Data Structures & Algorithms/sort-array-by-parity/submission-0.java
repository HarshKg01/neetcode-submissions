class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int idx = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 != 0){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            return nums;
        }
        for(int j = idx+1;j<nums.length;j++){
            if(nums[j]%2==0){
                int temp = nums[idx];
                nums[idx] = nums[j];
                nums[j] = temp;
                idx++;
            }
        }
        return nums;
    }
}