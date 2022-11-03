#include <iostream>
using namespace std;

int main() {
    int n, count = 0, ans = 0;
    string line;

    cin >> n >> line;
    for (int i = 0; i < n; i++) {
        if(line[i] == 'a')
            count++;
        else{
            if(count > 1){
                ans += count;

            }
            count = 0;
        }
    }

    if(count > 1) ans += count;
    cout << ans << endl;
    return 0;
}
