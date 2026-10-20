
class Solution {
    public long countBadPairs(int[] nums) {
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;

            count += i - map.getOrDefault(key, 0);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}
