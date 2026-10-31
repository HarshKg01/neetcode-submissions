class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <='9'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() != 0){
            sb.append(st.peek());
            st.pop();
        }
        sb.reverse();
        return sb.toString();
    }
}
