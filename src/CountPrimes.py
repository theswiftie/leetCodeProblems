class Solution(object):
    def countPrimes(self, n):
        if n > 2:
            nums = [True] * n
            nums[0] = nums[1] = False
            
            for num in range(2, int(n**0.5) + 1):
                if nums[num]:
                    nums[num*num:n:num] = [False] * len(nums[num*num:n:num])
            return sum(nums)
        return 0

sol = Solution()
print(sol.countPrimes(1000))