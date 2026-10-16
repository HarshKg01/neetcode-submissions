class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>map = new HashMap<>();
        String[] ans  = new String[names.length];
        for(int i = 0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        int n = heights.length;
        Arrays.sort(heights);
        for(int i = 0;i<heights.length;i++){
            ans[i] = map.get(heights[n-1-i]);
        }
        return ans;
    }
}