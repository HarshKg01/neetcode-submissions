class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashSet<Character>set1 = new HashSet<>();
         String[] word = s.split(" ");
         if(word.length != pattern.length()){
            return false;
         }
        for(int i = 0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            set1.add(ch);
        }
        
        
        HashSet<String>set2 = new HashSet<>();
        for(int i = 0;i<word.length;i++){
            set2.add(word[i]);
        }
        if(set1.size() != set2.size()){
            return false;
        }
        
        return true;
    }
}