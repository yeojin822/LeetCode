class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;

  
    for(int i = 0; i < nums.length; i++){
        if(nums[i] != 0){
            sum += nums[i];               
        }else{ 
            max = Math.max(sum,max);
            sum = 0;
        }
    }
        return Math.max(sum,max);
    }
}