#include <bits/stdc++.h>
using namespace std;

int n, m;

int check(int arr[], int mid) {
	int container = 1;
	int current_capacity = mid;

	for (int i = 0; i < n; ++i) {
		if (arr[i] > current_capacity) {
			if (container == m  || arr[i] > mid) return -1;
			container++;
			current_capacity = mid; // current capacity reseting
		}
		current_capacity -= arr[i];
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
	while(cin >> n >> m) {
		int a[n] = {0};
		for (int i = 0; i < n; ++i)
			cin >> a[i];
		int ans = bnry_srch(a, 1, 10e+9); // maximum capacity which can be needed
		                                                // = 10^3(number of vessels) * 10^6(capacity of each vessel) = 10^9
		cout << ans << endl;
	}
}
