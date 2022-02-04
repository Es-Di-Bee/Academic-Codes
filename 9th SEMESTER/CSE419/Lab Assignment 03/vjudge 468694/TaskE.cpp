#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cin >> n;
	int a[n] = {0};

	for (int i = 0; i < n; ++i) cin >> a[i];

	int q;
	cin >> q;

	while (q--) {
		int h;
		cin >> h;

		int ans1 =  lower_bound(a, a+n, h) - a;
		int ans2 =  upper_bound(a, a+n, h) - a;

		if (ans1 == 0) cout << "X ";
		else cout << a[ans1-1] << " ";

		if (ans2 == n) cout << "X" << endl;
		else cout << a[ans2] << endl;
	}
}
