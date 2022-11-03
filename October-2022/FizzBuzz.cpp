#include <iostream>
using namespace std;

int main() {
    int x, y, n;
    cin >> x >> y >> n;

    string result;
    for(int i = 1; i <= n; i++){
        if(i % x == 0)
            result += "Fizz";

        if(i % y == 0)
            result += "Buzz";

        (result.empty())? cout << i << endl :
            cout << result << endl;
        result.clear();
    }

    return 0;
}
