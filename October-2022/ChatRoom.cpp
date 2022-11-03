#include <iostream>
using namespace std;

int main() {
    string s;
    cin >> s;

    bool h = false, e = false, l1Up = false,
         l1 = false, l2 = false, o = false;

    for (int i = 0; i < s.length(); i++) {
        if(s[i] == 'h') h = true;
        if(h && s[i] == 'e') e = true;
        // L1Up necessary to consider subsequent 'l'
        if(!l1Up && e && s[i] == 'l') {l1 = true; l1Up = true; continue;}
        if(l1 && s[i] == 'l') l2 = true;
        if(l2 && s[i] == 'o') o = true;
    }
    o ? cout << "YES\n" : cout << "NO\n";
    return 0;
}

//
