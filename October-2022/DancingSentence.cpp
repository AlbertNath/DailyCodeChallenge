#include <cctype>
#include <iostream>
using namespace std;

int main() {
    string s;
    bool prevUpper = false;
    while (getline(cin, s)) {

        for(int i = 0; i < s.length(); i++){
            if(s[i] == ' ') continue;

            if(prevUpper && isupper(s[i])){
                s[i] = tolower(s[i]);
                prevUpper = false;
                continue;
            }

            if(!prevUpper){
                s[i] = toupper(s[i]);
                prevUpper = true;
            } else {
                prevUpper = false;
            }
        }
        prevUpper = false;
        cout << s << endl;
    }
    return 0;
}
