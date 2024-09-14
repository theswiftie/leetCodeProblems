class Solution (object):
    def isPalindrome(self, s):
        if len(s) == 0 or len(s) == 0:
            return True
        elif (s[0] == s[-1]):
            return self.isPalindrome(s[1:-1])
        else:
            return False;

sol = Solution()
s = "stats"
print(sol.isPalindrome(s));
s = "lol"
print(sol.isPalindrome(s));
s = "naan"
print(sol.isPalindrome(s));