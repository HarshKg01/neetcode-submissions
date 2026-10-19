class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map = new HashMap<>();
        String[] s = s1.split(" ");
        String[] t = s2.split(" ");
        for(int i = 0;i<s.length;i++){
            if(map.containsKey(s[i])){
                map.put(s[i],map.get(s[i])+1);
            }
            else{
                map.put(s[i],1);
            }
        }
        for(int i = 0;i<t.length;i++){
            if(map.containsKey(t[i])){
                map.put(t[i],map.get(t[i])+1);
            }
            else{
                map.put(t[i],1);
            }
        }
        ArrayList<String>list = new ArrayList<>();
        for(String a : map.keySet()){
            if(map.get(a)<=1){
                list.add(a);
            }
        }
        String[] ans = new String[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
