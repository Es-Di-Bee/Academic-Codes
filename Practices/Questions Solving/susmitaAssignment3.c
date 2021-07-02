#include <stdio.h>
#include <stdbool.h>

int main() {
    int n = 0;
    scanf("%d", &n);
    int sum = 1;
    bool addOne = true;

    for (int i = 2; i <= n; ++i) {
        if (addOne == true) {
            sum += i;
            ++i;
            addOne = false;
        } else {
            sum += i;
            addOne = true;
        }
    }

    printf("%d\n", sum);

    return 0;
}

