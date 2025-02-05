class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        add = nums[0]
        maxum = add
        for i in range(1, len(nums)):
            if nums[i - 1] < nums[i]:
                add+=nums[i]
                maxum = max(add, maxum)
            else:
                add = nums[i]
        return maxum
        