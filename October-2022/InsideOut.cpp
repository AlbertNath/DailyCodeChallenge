#include <iostream>
#include <cstring>
#include <string>
#include <algorithm>
#include <type_traits>
#include <utility>
using namespace std;

int main() {
    int t, m;
    string s, s1, s2, r;

    cin >> t;
    getline(cin, s);

    while (t--) {
        getline(cin, s);
        m = s.length()/2;

        // for(int i = 0; i < m/2; i++){
        //     swap(s[i], s[m - i - 1]);
        // }

        // for (int j = m; j/2 < s.length(); j++) {
        //     swap(s[j], s[s.length() - j - 1]);
        // }

        // cout << s << endl;
        for (int i = 0; i < m; i++)
            s1 += s[i];

        for (int i = m; i < s.length(); i++)
            s2 += s[i];

        reverse(s1.begin(), s1.end());
        reverse(s2.begin(), s2.end());

        cout << s1 + s2 << endl;
        r.clear();
        s1.clear();
        s2.clear();
    }

    return 0;
}
