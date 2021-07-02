#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main() {
    int tc;
    scanf("%d", &tc);
    for (int t = 1; t <= tc; ++t) {
        ll L, R;
        scanf("%lld %lld", &L, &R);
        ll base = (ll)(sqrt((long double)R));
        ll result1 = base;
        base = (ll)(sqrt((long double)R/2));
        result1 += base;
        base = (ll)(sqrt((long double)(L-1)));
        ll result2 = base;
        base = (ll)(sqrt((long double)(L-1)/2));
        result2 += base;
        ll ans = result1 - result2;
        printf("Case %d: %lld\n", t, ans);
    }
}
