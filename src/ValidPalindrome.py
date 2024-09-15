import re

class Solution (object):
    def isPalindrome(self, s):
        s = (re.sub(r'[^\w]', '', s)).replace('_', '').lower()

        return s == s[::-1]

sol = Solution()
print(sol.isPalindrome("race a car"));
print(sol.isPalindrome("A man, a plan, a canal: Panama"))