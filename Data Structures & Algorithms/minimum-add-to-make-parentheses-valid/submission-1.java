class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int n = s.length();
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                count++;
                st.push(ch);
            }
            else if(ch == ')' && st.peek() == '('){
                st.pop();
                count--;
            }
            else{
                st.push(ch);
                count++;
            }
        }
        return count;
    }
}
