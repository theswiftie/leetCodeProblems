class Solution (object):
    def isPalindrome(self, s):
        phrase = ""
        for letter in s:
            if letter.isalnum():
                phrase += letter.lower()

        return phrase == phrase[::-1]

sol = Solution()
print(sol.isPalindrome("race a car"));
print(sol.isPalindrome("A man, a plan, a canal: Panama"))