class Solution {
    public boolean isPalindrome(String s) {
        String alphaString = alphanumeric(s);
        String z = alphaString.toLowerCase();
        StringBuilder sb = new StringBuilder(z);
        sb = sb.reverse();
        String t = sb.toString();
        if(z.equals(t)){
            return true;
        }
        return false;
    }
    public String alphanumeric(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' ||
               s.charAt(i)>='A' && s.charAt(i)<='Z' ||
               s.charAt(i)>='0' && s.charAt(i)<='9'
            ){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
