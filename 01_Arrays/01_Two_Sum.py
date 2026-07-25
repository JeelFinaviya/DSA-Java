
# Problem: Two Sum
# LeetCode: 1
# Topic: Arrays
# Difficulty: Easy
# Time Complexity: O(n²)
# Space Complexity: O(1)

class Solution(object):
    def twoSum(self, nums, target):
        for i, k in enumerate(nums):
            for j, m in enumerate(nums):
                if i != j:
                    if k + m == target:
                        return [i, j]
