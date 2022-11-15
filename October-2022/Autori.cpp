#include <iostream>
#include <sstream>
#include <string>
using namespace std;

int main() {

  string in, tmp, out;
  getline(cin, in);

  stringstream ss(in);

  while (getline(ss, tmp, '-'))
    out += tmp[0];

  cout << out << endl;

  return 0;
}
