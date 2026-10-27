class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract the length of the string
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            String s = str.substring(j + 1, j + 1 + len);
            result.add(s);

            // Move to the next encoded string
            i = j + 1 + len;
        }

        return result;
    }
}