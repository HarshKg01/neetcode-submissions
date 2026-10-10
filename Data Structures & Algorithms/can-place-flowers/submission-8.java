class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean even = false;
        boolean odd = false;
        for(int i = 0;i<flowerbed.length;i++){
            if(i%2 == 0 && flowerbed[i] == 1){
                even = true;
                break;
            }
            else if(i%2 != 0 && flowerbed[i]==1){
                odd = true;
                break;
            }
        }
        if(even == true){
            for(int i = 0;i<flowerbed.length-1;i=i+2){
                if(flowerbed[i]==0 && flowerbed[i+1] != 1){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        else{
            for(int i = 0;i<flowerbed.length-1;i=i+2){
                if(flowerbed[i] == 0 && flowerbed[i+1] != 1){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        if(flowerbed.length>2 && flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] != 1){
            flowerbed[flowerbed.length-1] = 1;
            n--;
        }
        if(even == false && odd == false){
            for(int i = 0;i<flowerbed.length;i=i+2){
                n--;
            }
        }
        
        if(n<=0){
            return true;
        }
        return false;
    }
}