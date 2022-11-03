#include <iostream>
#include <cstring>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    int t, m;
    string s, s1, s2, r;

    cin >> t;
    getline(cin, s);

    while (t--) {
        getline(cin, s);
        m = s.length()/2;

        for (int i = 0; i < m; i++)
            s1 += s[i];

        for (int i = m; i < s.length(); i++)
            s2 += s[i];

        reverse(s1.begin(), s1.end());
        reverse(s2.begin(), s2.end());

        r = s1 + s2;
        cout << r << endl;
        r.clear();
        s1.clear();
        s2.clear();
    }

    return 0;
}
