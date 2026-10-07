class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int sum = 0;
        if(n == 1){
            return 1;
        }
        for(int i = 1;i<=n;i++){
           sum += i;
           if((n-sum)>0){
                count++;
           }
           else{
            break;
           }
        }
        return count;
    }
}