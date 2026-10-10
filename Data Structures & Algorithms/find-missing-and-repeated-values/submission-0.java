class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] ans = new int[2];
        int n = grid.length;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                if(map.containsKey(grid[i][j])){
                    map.put(grid[i][j],map.get(grid[i][j])+1);
                }
                else{
                    map.put(grid[i][j],1);
                }
            }
        }
        for(int i = 1;i<=n*n;i++){
            if(map.containsKey(i) && map.get(i)==2){
                ans[0] = i;
            }
            if(!map.containsKey(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}