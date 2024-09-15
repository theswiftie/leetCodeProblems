class Solution(object):
    def firstUniqChar(self, s):
        letters = []
        
        for index, char in enumerate(s):
            if not char in letters:
                if s.count(char) == 1:
                    return index
                letters.append(char)
        return -1

sol = Solution()
print(sol.firstUniqChar("leetcode"))
print(sol.firstUniqChar("loveleetcode"))
print(sol.firstUniqChar("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"))