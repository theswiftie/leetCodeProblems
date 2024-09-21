#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        int value = 0;
        unordered_map<char, int> valMap = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 != s.length() && valMap[s[i]] < valMap[s[i + 1]]) {
                value -= valMap[s[i]];
            }
            else {
                value += valMap[s[i]];
            }
        }

        return value;
    }
};

int main(int argc, char const *argv[]) {
    Solution sol = Solution();
    cout << sol.romanToInt("LVIII") << endl;
}