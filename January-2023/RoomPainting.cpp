#include <bits/stdc++.h>
using namespace std;

int main() {
    long long can_s, num_c, curr_low = 0, waste = 0;
    string curr;
    vector<int> c, p;
    cin >> can_s >> num_c;

    getline(cin, curr);
    while (can_s--) {
        getline(cin, curr);
        c.push_back(stoi(curr));
    }

    while (num_c--) {
        getline(cin, curr);
        p.push_back(stoi(curr));
    }
    sort(c.begin(), c.end());

    for (long long i : p) {
        auto l1 = lower_bound(c.begin(), c.end(), i);
        curr_low = distance(c.begin(), l1);
        waste += c[curr_low] - i;
    }
    cout << waste << endl;
    return 0;
}
