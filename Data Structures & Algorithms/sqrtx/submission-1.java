class Solution {
    public int mySqrt(int x) {
        int ans = 1;
        for(int i = 0;(long)i*i<=x;i++){
                ans = i; 
            
        }
        return ans;
    }
}