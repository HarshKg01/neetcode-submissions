
class Solution {
    public String largestGoodInteger(String num) {

        int count = 1;
        String ans = "";

        for (int i = 1; i < num.length(); i++) {

            if (num.charAt(i) == num.charAt(i - 1)) {
                count++;
            } 
            else {
                count = 1;
            }

            if (count >= 3) {
                String temp = num.substring(i - 2, i + 1);

                if (ans.isEmpty() || temp.compareTo(ans) > 0) {
                    ans = temp;
                }
            }
        }

        return ans;
    }
}