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
	int books = 0;

	while(cin >> books) {
		int a[books] = {0};

		for (int i = 0; i < books; ++i)
			cin >> a[i];

		sort(a, a+books);

		int money;

		cin >> money;

		int num1 = floor(money/2);
		int num2 = money - num1;

		int ans1, ans2;

		while (num1 < money && num2 > 0) {
			int idx1 = bnry_srch(a, 0, books-1, num1);
			int idx2 = bnry_srch(a, 0, books-1, num2);
			if (idx1 == idx2) {
				if (idx1 + 1 < books && a[idx1+1] == a[idx1]) {
					ans1 = a[idx1];
					ans2 = a[idx1+1];
					break;
				} else if (idx1 - 1 >= 0 && a[idx1-1] == a[idx1]) {
					ans1 = a[idx1];
					ans2 = a[idx1-1];
					break;
				}
			} else if (idx1 != -1 && idx2 != -1) {
				ans1 = a[idx1];
				ans2 = a[idx2];
				break;
			}
			--num1;
			++num2;
		}

		cout << "Peter should buy books whose prices are " << ans1 << " and " << ans2 << ".\n\n";
	}
}
