class Solution {
    public int candy(int[] ratings) {
        
        if(ratings.length == 1)
            return 1;
        
        int length = ratings.length;
        int[] count = new int[length];
        
        count[0] = 1;
        
        for(int i = 1; i < length; i++){
            if(ratings[i] > ratings[i - 1]){
                count[i] = count[i - 1] + 1;
            }
            else{
                count[i] = 1;
            }
        }
        
        int totalCount = count[length - 1];
        
        for(int i = length - 2; i >= 0; i--){
            int temp = 1;
            
            if(ratings[i] > ratings[i + 1]){
                temp = count[i + 1] + 1;
            }    
            
            totalCount = totalCount + Math.max(temp, count[i]);
            count[i] = temp;
            
            
        }
        
        return totalCount;
    }
}