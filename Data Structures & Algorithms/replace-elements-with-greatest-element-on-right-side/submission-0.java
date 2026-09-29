class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            int val = arr[i];
            arr[i] = greatest;
            if(greatest<val){
                greatest = val;
            }
        }
        return arr;
    }
}