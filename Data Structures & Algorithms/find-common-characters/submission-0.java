class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            StringBuilder temp = new StringBuilder();

            for (int j = 0; j < sb.length(); j++) {
                char ch = sb.charAt(j);
                int idx = words[i].indexOf(ch);

                if (idx != -1) {
                    temp.append(ch);
                    words[i] = words[i].substring(0, idx)
                            + words[i].substring(idx + 1);
                }
            }

            sb = temp;
        }

        for (int i = 0; i < sb.length(); i++) {
            ans.add(String.valueOf(sb.charAt(i)));
        }

        return ans;
    }
}
