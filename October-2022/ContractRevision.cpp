#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() {

    char d;
    string s, n;

    while(getline(cin, s)){
        if(s == "0 0")
            return 0;

        d = s[0];
        n = s.erase(0,2);

        n.erase(remove(n.begin(), n.end(), d), n.end());

        while(n[0] == '0')
            n.erase(0,1);

        (n.find_first_not_of("0") == string::npos || n.empty()) ?
            cout << "0" << endl :
            cout << n << endl;
    }
    return 0;
}
