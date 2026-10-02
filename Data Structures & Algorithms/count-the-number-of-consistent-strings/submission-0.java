class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < words[i].length(); j++) {
                set.add(words[i].charAt(j));
            }

            boolean consistent = true;

            for (char x : set) {
                if (!allowed.contains(String.valueOf(x))) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}