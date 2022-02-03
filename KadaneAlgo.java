package leetcode_solutions;

class KadaneAlgo {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], currSum = 0;
        
        for(int i = 0; i<nums.length; i++){
            currSum+= nums[i];
            
            maxSum = Math.max(maxSum, currSum);
            
            if(currSum < 0)
                currSum = 0;
        }
        
        return maxSum;
    }
}