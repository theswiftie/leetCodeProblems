#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    int strStr(string haystack, string needle) {
        if (needle.length() <= haystack.length()) {
            if (haystack.find(needle) != string::npos) {
                return haystack.find(needle);
            }
            return -1;
        }
        return -1;
    }
};

int main(int argc, char const *argv[]) {
    Solution sol = Solution();
    cout << sol.strStr("sadsoupsad", "sad") << endl;
    cout << sol.strStr("leetcode", "leeto") << endl;
    return 0;
}
