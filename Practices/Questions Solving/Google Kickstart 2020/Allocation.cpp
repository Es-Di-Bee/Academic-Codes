#include<bits/stdc++.h>
using namespace std;
#define ll long long

void fastIO() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
}

int main() {
    int tc = 0;
    cin >> tc;
    for (int t = 1; t <= tc; ++t) {
        int n = 0, b = 0;
        cin >> n >> b;
        int a[n] = {0};
        for (int i = 0 ; i < n; ++i) {
            cin >> a[i];
        }
        sort(a, a+n);
        ll cost = 0;
        ll houses = 0;
        for (int i = 0; i < n; ++i) {
            cost += a[i];
            if (cost > b) break;
            ++houses;
        }
        cout << "Case #" << t << ": " << houses << endl;
    }
}
