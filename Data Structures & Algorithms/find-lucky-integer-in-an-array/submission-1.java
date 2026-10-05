class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map  = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int ans = -1;
        for(int x : map.keySet()){
            if(x == map.get(x)){
                ans = Math.max(x,ans);
            }
        }
        return ans;
    }
}