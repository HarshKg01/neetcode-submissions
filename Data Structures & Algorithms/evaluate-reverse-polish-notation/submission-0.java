class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer>st = new Stack<>(); 
        for(int i = 0;i<n;i++){
            if(tokens[i].equals("+")){
                int val1 = st.get(st.size()-1);
                int val2 = st.get(st.size()-2);
                int val3 = val1+val2;
                st.pop();
                st.pop();
                st.push(val3);
            }
            else if(tokens[i].equals("-")){
                int val1 = st.get(st.size()-1);
                int val2 = st.get(st.size()-2);
                int val3 = val2-val1;
                st.pop();
                st.pop();
                st.push(val3);
            }
            else if(tokens[i].equals("*")){
                int val1 = st.get(st.size()-1);
                int val2 = st.get(st.size()-2);
                int val3 = val1*val2;
                st.pop();
                st.pop();
                st.push(val3);
            }
            else if(tokens[i].equals("/")){
                int val1 = st.get(st.size()-1);
                int val2 = st.get(st.size()-2);
                int val3 = val2/val1;
                st.pop();
                st.pop();
                st.push(val3);
            }
            else{
                int val1 = Integer.parseInt(tokens[i]);
                st.push(val1);
            }
        }
        return st.peek();
    }
}
