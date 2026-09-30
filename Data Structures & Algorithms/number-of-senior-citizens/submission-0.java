class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0;i<details.length;i++){
            String val = details[i].substring(11,13);
            int value = Integer.parseInt(val);
            if(value>60){
                count++;
            }
        }
        return count;
    }
}