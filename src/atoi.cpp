#include <iostream>
using namespace std;

int myAtoi(string s) {
    int num = 0;
    int neg = 1;

    // consume whitespace
    while(s[0] == ' ') {
        s = s.erase(0,1);
    }
    // check for sign
    if (s[0] == '-' || s[0] == '+') {
        if (s[0] == '-') neg = -1;
        s = s.erase(0,1);
    }

    // consumer digits
    while (isdigit(s[0])) {
        if (num != 0) {
            num = num * 10 + s[0];
        }
        else {
            num = s[0];
        }
        s = s.erase(0,1);
    }
    return num;
}

int main(int argc, char const *argv[]) {

    return 0;
}