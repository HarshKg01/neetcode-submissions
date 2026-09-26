class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] ans = new int[k];
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i = 0;i<k;i++){
            int maxfreq = -1;
            int maxelem = 0;
            for(int key : map.keySet()){
                if(map.get(key)>maxfreq){
                    maxfreq = map.get(key);
                    maxelem = key;
                }
            }
                ans[i] = maxelem;

                map.remove(maxelem);
            
        }
        return ans;
    }
}
