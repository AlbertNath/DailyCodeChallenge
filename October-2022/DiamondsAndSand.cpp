#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
  int t, ans = 0; cin >> t;
  string s;
  stack<char> chars;

  getline(cin, s);

  while (t--) {
    getline(cin, s);

    for (int i = 0; i < s.length(); i++) {
      if(s[i] == '.') continue;

      if(s[i] == '<')
        chars.push(s[i]);

      if(!chars.empty()){
        if(s[i] == '>' && chars.top() == '<'){
          chars.pop();
          ans++;
        }
      }
    }

    cout << ans << endl;
    ans = 0;
    while(!chars.empty())
      chars.pop();
  }

  return 0;
}
