class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        for(int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int i = 1;
        int j = max;
        int ans = max;

        while(i <= j) {

            int mid = i + (j - i) / 2;

            long sumh = 0;

            for(int k = 0; k < piles.length; k++) {

                sumh += piles[k] / mid;

                if(piles[k] % mid != 0) {
                    sumh++;
                }
            }

            if(sumh <= h) {
                ans = mid;
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        return ans;
    }
}