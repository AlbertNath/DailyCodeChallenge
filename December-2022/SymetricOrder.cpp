#include <bits/stdc++.h>
#include <cstdio>
#include <string>
using namespace std;

int main() {
    int n, c = 1;
    string name, p;
    bool inv = true;
    vector<string> names, top, bot;
    cin >> n;
    while(n != 0){

        n++;
        while (n--) {
            getline(cin, name);
            names.push_back(name);
        }

        p = names[names.size() - 1];
        for (int i = 0; i < names.size() - 1; i++) {
            if(inv){
                bot.push_back(names[i]);
            } else {
                top.push_back(names[i]);
            }
            inv = !inv;
        }

        printf("SET %d\n", c);
        for(int i = 0; i < top.size(); i++){
            cout << top[i] << endl;
        }
        cout << p << endl;
        for(int i = bot.size() - 1; i >= 0; i--){
            cout << bot[i] << endl;
        }

        top.clear(); bot.clear(); names.clear();
        inv = true;
        cin >> n;
        p.clear();
        c++;
    }

    return 0;
}
