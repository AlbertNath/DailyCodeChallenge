#include <stdio.h> 
#include <math.h>
#include <stdlib.h>

int main(){
    int num1, num2, sum, diff;
    float num3, num4, s, d;

    scanf("%d" "%d", &num1, &num2);
    sum = num1 + num2;
    diff = num1 - num2;

    scanf("%f" "%f", &num3, &num4);
    s = num3 + num4;
    d = num3 - num4;

    printf("%d " "%d\n", sum, diff);
    printf("%2.1f " "%2.1f", s, d);
    
    return 0;
}