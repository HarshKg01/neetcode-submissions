class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            if(!set.contains(i+1)){
                ans.add(i+1);
            }
        }
        return ans;
    }
}