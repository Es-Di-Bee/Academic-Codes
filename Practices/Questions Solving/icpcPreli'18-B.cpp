#include<bits/stdc++.h>
using namespace std;
int main() {
    int tc;
    scanf("%d", &tc);
    for(int c = 1; c <= tc; ++c) {
        int count = 0;
        int r1, c1;
        scanf("%d %d", &r1, &c1);
        for (int r2 = 1; r2 <= 8; ++r2) {
            for (int c2 = 1; c2 <= 8; ++c2) {
                if ( pow((r1-r2),2) + pow((c1-c2),2) == 5 ) {
                    ++count;
                }
            }
        }
        printf("Case %d: %d\n", c, count);
    }
}
