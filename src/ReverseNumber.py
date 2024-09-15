class Solution(object):
    def reverse(self, x):
        str_x = str(x).strip('-')
        sign = -1 if x < 0 else 1
        if len(str_x) == 10:
            if sign == 1 and int(str_x[::-1]) < 2147483647:
                return int(str_x[::-1])
            elif sign == -1 and sign*int(str_x[::-1]) > -2147483648:
                return sign*int(str_x[::-1])
            else:
                return 0
        else:
            return sign*int(str_x[::-1])
sol = Solution()
print(sol.reverseNumber(2147483647))