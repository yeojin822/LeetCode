class Solution(object):
    def runningSum(self, nums):
        rArray = [];
        temp = 0;
        for num in nums:
            temp += num
            rArray.append(temp)

        return rArray;
        """
        :type nums: List[int]
        :rtype: List[int]
        """
    