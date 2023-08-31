class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 1;

  
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                maxCount = Math.max(maxCount, count);
            }
            if (i == nums.length - 1 && nums[i] == 1) {
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}