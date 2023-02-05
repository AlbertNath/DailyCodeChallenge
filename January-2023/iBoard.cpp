#include <bits/stdc++.h>
using namespace std;

int main() {
    string line, bin;
    int o, z = 0;

    while (getline(cin, line)) {
        for (char ch : line)
            bin += bitset<7>(ch).to_string();

        for(char ch : bin)
            (ch == '1') ? o++ : z++;

        (o % 2 == 0 && z % 2 == 0)?
            cout << "free" << endl :
            cout << "trapped" << endl;

        bin.clear();
        o = z = 0;
    }
    return 0;
}
