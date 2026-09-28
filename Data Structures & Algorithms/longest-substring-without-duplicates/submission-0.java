class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int count = 0;
        int maxcount = 0;
        HashSet<Character>set = new HashSet<>();
        for(int right = 0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                count++;
            }
            else{
                maxcount = Math.max(count,maxcount);
                set.remove(s.charAt(left));
                left++;
                right--;
                count--;
            }
        }
        maxcount = Math.max(count,maxcount);
        return maxcount;
    }
}
