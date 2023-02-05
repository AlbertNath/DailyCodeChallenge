#include <bits/stdc++.h>
using namespace std;

int main() {
    long long gcvwr, truck, current, total = 0;
    int items = 0;
    cin >> gcvwr >> truck >> items;
    long long c = (gcvwr - truck) * .9;

    while (items--) {
        cin >> current;
        total += current;
    }

    cout << c - total << endl;
    return 0;
}
