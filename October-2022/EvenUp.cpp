#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {

  string s;
  int t, current, sum;
  stack<int> nums;
  cin >> t;

  getline(cin, s);

  while (t--) {
    cin >> current;

    if(!nums.empty()){
      sum = current + nums.top();

      if(sum % 2 == 0){
        nums.pop();
        continue;
      } else
        nums.push(current);

    } else
      nums.push(current);
  }

  cout << nums.size() << endl;

  return 0;
}
