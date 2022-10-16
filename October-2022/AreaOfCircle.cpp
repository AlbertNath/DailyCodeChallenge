#include <iostream>
#include <cmath>
#include <cstdio>
#include <math.h>

using namespace std;
int main() {

    long double R = 3.14159;
    long double radius;
    cin >> radius;

    printf("A=%.4LF\n", (radius * radius) * R);
    return 0;
}
