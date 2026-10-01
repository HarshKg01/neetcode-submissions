class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int odd =0;
        int even = 0;
        int evenmin = Integer.MAX_VALUE;
        int oddmax = 0;
        for(int i = 0;i<26;i++){
            if(freq[i]%2 == 0 && freq[i]!= 0){
                even = freq[i];
                evenmin = Math.min(even,evenmin);
            }
            else{
                odd = freq[i];
                oddmax = Math.max(odd,oddmax);
            }
        }
        return oddmax - evenmin;
    }
}