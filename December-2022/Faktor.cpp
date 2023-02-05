#include <bits/stdc++.h>
using namespace std;

int main() {
    long long articles, factor;
    cin >> articles >> factor;

    cout << (articles*(factor - 1)) + 1 << endl;

    return 0;
}
