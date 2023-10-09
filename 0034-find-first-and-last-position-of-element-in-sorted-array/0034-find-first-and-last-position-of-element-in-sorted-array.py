class Solution(object):
    def searchRange(self, nums, target):        
        first = -1
        last = -1
        
        for i in range(len(nums)):
            if nums[i] == target:
                first = i
                while i < len(nums) and nums[i] == target:
                    i += 1
                last = i - 1
                return [first, last]
        return [first, last]
