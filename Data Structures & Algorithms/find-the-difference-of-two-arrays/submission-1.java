
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for (int x : set1) {
            if (!set2.contains(x)) {
                temp1.add(x);
            }
        }

        for (int x : set2) {
            if (!set1.contains(x)) {
                temp2.add(x);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(temp1);
        ans.add(temp2);

        return ans;
    }
}
