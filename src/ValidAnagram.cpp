#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool isAnagram(string s, string t) {
    if (s.size() == t.size()) {
        std::sort(s.begin(), s.end());
        std::sort(t.begin(), t.end());

        return s == t;
    };
    return false;
}
int main(int argc, char const *argv[]) {
    cout << isAnagram("cat", "act");
    cout << isAnagram("mart", "tram");   
    cout << isAnagram("taxing", "ginat");
};