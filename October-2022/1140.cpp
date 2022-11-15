#include <cctype>
#include <iostream>
#include <sstream>
#include <string>
#include <set>
using namespace std;

int main() {

  string in, tmp;
  char c;
  set<char> s;

  while (getline(cin, in)) {
    if(in == "*") return 0;

    stringstream ss(in);

    while (ss >> tmp) {
      c = tolower(tmp[0]);
      s.insert(c);
    }

    if(s.size() == 1)
       cout << "Y\n";
    else{
       cout << "N\n";
       s.clear();
    }

    s.clear();
  }

  return 0;
}
