#include <bits/stdc++.h>

using namespace std;
using tup = tuple<int, string>;

struct comparepq {
    bool operator() (tup a, tup b) {
        return get<0>(a) > get<0>(b);
    }
};

int main() {
    int t; cin >> t;
    string in1, in2;
    bool oddNum = false;
    priority_queue<tup, vector<tup>, comparepq> pq;

    getline(cin, in1);
    while (t--) {
        cin >> in1 >> in2;
        if(in1.find_first_not_of("0123456789") == string::npos){
            int targ0 = stoi(in1);
            if (!oddNum && targ0 % 2 != 0){
                oddNum = true;
                pq.push(make_tuple(targ0, in2));
                continue;
            }

            if(oddNum)
                pq.push(make_tuple(targ0*2, in2));
            else
                pq.push(make_tuple(targ0/2, in2));

        } else {
            pq.push(make_tuple(stoi(in2), in1));
        }
    }

    while (!pq.empty()) {
        cout << get<1>(pq.top()) << endl;
        pq.pop();
    }
    return 0;
}
