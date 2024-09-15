class Solution(object):
    def fizzBuzz(self, n):
        fizz_indices = range(2, n, 3)
        buzz_indices = range(4, n, 5)
        fizzbuzz_indices = range(14, n, 15)
        
        arr = [str(i) for i in range(1, n + 1)]
        
        if n >= 3: arr[2:n+1:3] = ["Fizz"] * len(fizz_indices)
        if n >= 5: arr[4:n+1:5] = ["Buzz"] * len(buzz_indices)
        if n >= 15: arr[14:n+1:15] = ["FizzBuzz"] * len(fizzbuzz_indices)

        return arr
         
sol = Solution()
print(sol.fizzBuzz(15))