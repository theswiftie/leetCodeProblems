#include <iostream>
using namespace std;

int myAtoi(string s) {
    int num = 0;
    int sign = 1;
    int MIN = std::numeric_limits<int>::min();
    int MAX = std::numeric_limits<int>::max();

    // consume whitespace
    while(s[0] == ' ') {
        s = s.erase(0,1);
    }
    // check for sign
    if (s[0] == '-' || s[0] == '+') {
        if (s[0] == '-') sign = -1;
        s = s.erase(0,1);
    }

    // consumer digits
    while (isdigit(s[0])) {
        if (num * 10 + (s[0] - '0') > MAX) {
            num = MAX;
            break;
        }
        else if (num * 10 + (s[0] - '0') < MIN) {
            num = MIN;
            break;
        }
        else if (num != 0) {
                num = num * 10 + (s[0] - '0');
        }
        else {
            num = s[0] - '0';
        }
        s = s.erase(0,1);
    }    
    num *= sign;
    return num;
}
int main(int argc, char const *argv[]) {

    return 0;
}