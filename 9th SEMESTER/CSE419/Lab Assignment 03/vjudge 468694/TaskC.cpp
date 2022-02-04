#include <bits/stdc++.h>
using namespace std;

int bnry_srch(int arr[], int low, int high, int num) {
	if (high >= low) {
		int mid = (high + low) / 2;
		if (arr[mid] == num) {
			return mid;
		} else if (arr[mid] < num){
			return bnry_srch(arr, mid+1, high, num);
        	} else if (arr[mid] > num) {
            	return bnry_srch(arr, low, mid-1, num);
        	}
	} else {
		return -1;
	}
}

int main() {
	int count = 0;
	while(true) {
		++count;
		int n, q;

		cin >> n >> q;
		if (n == 0 && q == 0) break;
		int marbles[n] = {0};

		for (int i = 0; i < n; ++i) {
			cin >> marbles[i];
		}

		sort(marbles, marbles+n);

		cout << "CASE# " << count << ":" << endl;

		for (int i = 0; i < q; ++i) {
			int num;
			cin >> num;

			int ans = bnry_srch(marbles, 0, n-1, num);

			while (ans > 0 && marbles[ans-1] == marbles[ans]) {
				ans--;
			}

			if (ans != -1) {
				cout << num << " found at " << ans+1 << endl;
			} else {
				cout << num << " not found" << endl;
			}
		}

	}
}
