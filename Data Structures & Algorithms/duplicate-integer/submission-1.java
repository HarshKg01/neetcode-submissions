class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int x : map.keySet()){
            if(map.get(x)>=2){
                return true;
            }
        }
        return false;
    }
}