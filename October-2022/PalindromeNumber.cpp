#include <cstdlib>
#include <iostream>
#include <sstream>
#include <string>

using namespace std;

bool isPalindrome(int n) {
    string num = to_string(n);

    for(int i = num.length() - 1, j = 0; i >= 0; i--,j++)
        if(num[i] != num[j])
            return false;


    return true;
}

int main() {

    int n;
    cin >> n;
    cout << isPalindrome(n) << endl;
    return 0;
}
