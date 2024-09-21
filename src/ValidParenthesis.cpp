#include <iostream>
#include <stack>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack <char> parenStack;

        for (char brace: s) {
            if (brace == '{' || brace == '[' || brace == '(') {
                parenStack.push(brace);
            }
            else {
                if (!parenStack.empty() && (parenStack.top() == '{' && brace == '}' || parenStack.top() == '[' && brace == ']' || parenStack.top() == '(' && brace == ')')){
                    parenStack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
};

int main(int argc, char const *argv[]){
    Solution sol = Solution();
    cout << sol.isValid("({})");
    return 0;
}