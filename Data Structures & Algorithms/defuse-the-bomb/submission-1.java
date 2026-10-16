class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        int n = code.length;
        if(k>0){
        for(int i = 0;i<code.length;i++){
            int sum = 0;
            int j = i+1;
            int val = k;
            while(val>0){
                if(j>=n){
                    j = j % n;
                }
                sum += code[j];
                j++;
                val--;
            }
            ans[i] = sum;
        }
        }
        else if(k<0){
            for(int i = 0;i<code.length;i++){
                int sum = 0;
                int j = i-1;
                int val = Math.abs(k);
                while(val>0){
                    
                    if(j < 0){
                        j = n-1;
                    }
                    sum += code[j];
                    j--;
                    val--;
                }
                ans[i] = sum;
            }
        }
        else{
            for(int i = 0;i<n;i++){
                ans[i] = 0;
            }
        }
        return ans;
    }
}
