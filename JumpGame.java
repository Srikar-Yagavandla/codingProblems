class Solution {
    public boolean canJump(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        Arrays.fill(dp, -1);
        
        dp[nums.length - 1] = 1;
        
        int length = nums.length;
        
        canJumpHelper(nums, dp, length - 2, length, length - 1);
        
        return dp[0] == 1 ? true : false;
    }
    
    public void canJumpHelper(int[] nums, int[] dp, int index, int length, int lastTrueIndex)
    {    
        if(index < 0)
            return;
        
        if(dp[index] == -1 && nums[index] >= (length - 1 - index))
        {
            dp[index] = 1;
            if(lastTrueIndex > index)
                lastTrueIndex = index;
            
            canJumpHelper(nums, dp, index - 1, length, lastTrueIndex);
        }
        else
        {
            for(int i = index; i <= index + nums[index]; i++)
            {
                if(dp[i] == 1)
                {
                    dp[index] = 1;
                    
                    if(lastTrueIndex > index)
                        lastTrueIndex = index;
                    
                    break;
                }
            }
            
            if(dp[index] == -1)
            {
                dp[index] = 0;
            }
            
            canJumpHelper(nums, dp, index - 1, length, lastTrueIndex);
        }
        
    
    }
}