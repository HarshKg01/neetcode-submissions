
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i = 0;
        int count = 0;
        int cost = 0;

        for (int j = 0; j < s.length(); j++) {
            cost += Math.abs(s.charAt(j) - t.charAt(j));

            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }

            count = Math.max(count, j - i + 1);
        }

        return count;
    }
}
