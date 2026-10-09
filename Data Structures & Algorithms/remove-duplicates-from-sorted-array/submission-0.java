class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] != list.get(list.size()-1)){
                list.add(nums[i]);
            }
            else if(i == 0){
                list.add(nums[i]);
            }
            
        }
        for(int i =0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}