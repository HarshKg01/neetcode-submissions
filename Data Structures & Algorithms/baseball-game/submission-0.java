class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st = new Stack<>();
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("+") && st.size()>1){
                st.push(st.peek()+st.get(st.size()-2));
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                
                int first = st.get(st.size()-1);
                int third = first * 2;
                st.push(third);
                
            }
            else{
                st.push(Integer.valueOf(operations[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.peek();
            st.pop();
        }
        return sum;
    }
}