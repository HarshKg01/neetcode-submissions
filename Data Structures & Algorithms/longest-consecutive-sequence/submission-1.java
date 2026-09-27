class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int maxcount = 0;
        for(int i = 0;i<nums.length;i++){
            int val = nums[i];
            if(!set.contains(val -1)){
                int count = 1;
                while(set.contains(val+1)){
                 count++;
                 val = val +1;
             }
            
            maxcount = Math.max(count,maxcount);
            }
        }
       
        return maxcount;
    }
}
