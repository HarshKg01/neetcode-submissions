
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minoper = 0;
        int oper = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                oper++;
            }
        }

        minoper = oper;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                oper--;
            }

            if (blocks.charAt(i) == 'W') {
                oper++;
            }

            minoper = Math.min(oper, minoper);
        }

        return minoper;
    }
}