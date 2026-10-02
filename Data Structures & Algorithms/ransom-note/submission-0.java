class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        for(int i = 0;i<ransomNote.length();i++){
            str1[ransomNote.charAt(i)-'a']++;
        }
        for(int i = 0;i<magazine.length();i++){
            str2[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(str1[i] > str2[i]){
                return false;
            }
        }
        return true;
    }
}