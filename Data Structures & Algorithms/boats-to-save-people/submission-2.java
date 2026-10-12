class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int n = people.length;
        int j = n-1;
        int boatcnt = 0;
        
        while(i<=j){
            if(i == j){
                boatcnt++;
                i++;
                j--;
            }
            else if(people[j] == limit){
                boatcnt++;
                j--;
            }
            else if(people[i]+people[j]<=limit){
                boatcnt++;
                j--;
                i++;
            }
            else if(people[i]+people[j]>limit){
                boatcnt++;
                j--;
            }
        }
        return boatcnt;
    }
}