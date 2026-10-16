


class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr1) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int j = 0;

        for (int val : arr2) {
            int count = map.getOrDefault(val, 0);

            while (count > 0) {
                arr1[j++] = val;
                count--;
            }

            map.remove(val);
        }

        int[] remaining = new int[arr1.length - j];
        int k = 0;

        for (int val : map.keySet()) {
            int count = map.get(val);

            while (count-- > 0) {
                remaining[k++] = val;
            }
        }

        Arrays.sort(remaining);

        for (int val : remaining) {
            arr1[j++] = val;
        }

        return arr1;
    }
}
