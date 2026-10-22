
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < searchWord.length(); i++) {
            List<String> temp = new ArrayList<>();

            for (int j = 0; j < products.length; j++) {
                if (products[j].length() >= i + 1 &&
                    searchWord.substring(0, i + 1).equals(products[j].substring(0, i + 1))) {

                    temp.add(products[j]);

                    if (temp.size() == 3) {
                        break;
                    }
                }
            }

            ans.add(temp);
        }

        return ans;
    }
}
