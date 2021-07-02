#include <stdio.h>

int main() {
    int n = 0;
    scanf("%d", &n);
    int num2 = 3;
    int sum = 0;

    for (int num1 = 1; num1 <= n; ++num1,  ++num2) {
        int product = num1 * num2 * (++num2);
        sum += product;
    }

    printf("%d\n", sum);

    return 0;
}
