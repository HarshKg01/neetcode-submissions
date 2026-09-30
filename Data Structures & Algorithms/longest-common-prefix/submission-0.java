class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        int n = strs.length;
        String second = strs[n-1];
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(i<first.length() && j<second.length()){
            if(first.charAt(i)==second.charAt(j)){
                sb.append(first.charAt(i));
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}