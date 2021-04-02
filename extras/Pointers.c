#include <stdio.h>
#include <stdlib.h>

/** 2021-03-30 */
void update(int *a,int *b) {
    *a = *a + *b;
    *b = abs(*a - 2*(*b)); 
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}