class Solution {
    public int[] findDuplicates(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
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
            if(map.get(x)==2){
                list.add(x);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
