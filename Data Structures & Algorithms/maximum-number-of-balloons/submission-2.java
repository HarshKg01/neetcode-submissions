

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            } else {
                map.put(text.charAt(i), 1);
            }
        }

        String word = "balloon";
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (map.containsKey(ch)) {
                mini = Math.min(mini, map.get(ch));
            } else {
                return 0;
            }
        }

        mini = Math.min(mini, map.get('l') / 2);
        mini = Math.min(mini, map.get('o') / 2);

        return mini;
    }
}