#include <bits/stdc++.h>
using namespace std;

int main() {
    string greet; cin >> greet;
    int c = 0, pos;

    for (int i = 0; i < greet.length(); i++) {
        if(greet[i] == 'e'){
            c++; pos = i;
        }
    }

    string added(c, 'e');
    cout << greet.insert(pos, added) << endl;

    return 0;
}
