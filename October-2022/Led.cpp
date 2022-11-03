#include <cstdio>
#include <iostream>
#include <string>
using namespace std;

void solve()
{
    string s;
    cin >> s;
    int total = 0;
    for(int i = 0; i < s.length(); i++){
        char c = s[i];
        switch (c) {
            case '0':
                total += 6;
                break;
            case '1':
                total += 2;
                break;
            case '2':
                total += 5;
                break;
            case '3':
                total += 5;
                break;
            case '4':
                total += 4;
                break;
            case '5':
                total += 5;
                break;
            case '6':
                total += 6;
                break;
            case '7':
                total += 3;
                break;
            case '8':
                total += 7;
                break;
            case '9':
                total += 6;
                break;
            default:
                break;
        }
    }
    printf("%d leds\n", total);
    total = 0;
}

int main()
{
    int t;
    cin >> t;

    while(t--)
        solve();

    return 0;
}
