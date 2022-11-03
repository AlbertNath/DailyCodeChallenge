#include <iostream>
#include <cstring>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    int t, m;
    string s, r;

    cin >> t;
    getline(cin, s);

    while (t--) {
        getline(cin, s);
        m = s.length()/2;
        char mid1[m], mid2[m];

        strncpy(mid1, &s[0], m);
        strncpy(mid2, &s[m], s.length() - m);

        reverse(mid1, mid1+m);
        reverse(mid2, mid2+m);

        printf("%s%s", mid1,mid2);
    }

    return 0;
}
