#include <stdio.h>
void main() {
    int x = 5, y = 3,sum=0;
    for (int i = 3; i <= 4; i++) {
        x = x + i;
        for (int j = 1; j <= i; j++) {
            sum = sum + x;  
            x = y;          
            y = i + 2;      
        }
    }
    printf("x:%d\n", x);
    printf("y:%d\n", y);
    printf("sum:%d\n", sum);
}
