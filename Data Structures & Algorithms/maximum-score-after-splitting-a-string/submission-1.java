class Solution {
    public int maxScore(String s) {
        int maxval = 0;
        for(int i = 0;i<s.length()-1;i++){
            int count0 = 0;
            int count1 = 0;
            int sum = 0;
            String left = s.substring(0,i+1);
            String right = s.substring(i+1,s.length());
            for(int j = 0;j<left.length();j++){
                if(left.charAt(j) == '0'){
                    count0++;
                }
            }
            for(int j = 0;j<right.length();j++){
                if(right.charAt(j)=='1'){
                    count1++;
                }
            }
            sum = count0 + count1;
            maxval = Math.max(maxval,sum);
        }
        return maxval;
    }
}