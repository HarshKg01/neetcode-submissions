class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int position = Integer.MAX_VALUE;
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    position = j;

                }
                else if(j<position){
                    continue;
                }
                else{
                    if(nums1[i]<nums2[j]){
                        ans[i] = nums2[j];
                        break;
                    }
                    
                }
                if(ans[i] == 0){
                    ans[i] = -1;
                }
            }
        }
        return ans;
    }
}