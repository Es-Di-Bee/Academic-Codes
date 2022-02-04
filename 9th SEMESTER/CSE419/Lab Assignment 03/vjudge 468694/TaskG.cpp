#include <bits/stdc++.h>
using namespace std;

int n;

int check(int arr[], int mid) {
	for (int i = 1; i < n+1; ++i) {
		int dif = arr[i] - arr[i-1];
		if (dif == mid) --mid;
		else if (dif > mid) return -1;
	}
	return 1;
}


int bnry_srch(int arr[], int low, int high) {
	int ans = 0;
	while (low <= high) {
		int mid = (low + high) / 2;
		int c = check(arr, mid);
		if (c == 1) {
			ans = mid;
			high = mid - 1;
		}
		else low = mid + 1;
	}
	return ans;
}


int main() {
	int tc;
	cin >> tc;
	for (int t = 1; t <= tc; ++t) {
		cin >> n;
		int a[n+1] = {0};
		for (int i = 1; i < n+1; ++i) cin >> a[i];
		int ans = bnry_srch(a, 1, 10e+7);
		cout << "Case " << t << ": " << ans << endl;
	}
}
