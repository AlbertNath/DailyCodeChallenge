#include <iostream>
#include <sstream>
#include <string>
#include <set>
using namespace std;

int main() {

  string in, tmp;
  set<string> s;
  getline(cin, in);

  stringstream ss(in);

  while (ss >> tmp) {
    if (s.count(tmp) == 0)
      s.insert(tmp);
    else{
      cout << "no\n";
      return 0;
    }
  }
  cout << "yes\n";

  return 0;
}
