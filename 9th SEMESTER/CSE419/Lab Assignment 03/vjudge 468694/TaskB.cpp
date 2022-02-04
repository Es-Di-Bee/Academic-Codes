#include <bits/stdc++.h>
using namespace std;

int main() {
	for(int tc = 1;; ++tc) {
		vector <int> v;
		int n;
		cin >> n;
		if (n == 0) {
			break;
		}
		while(n--) {
			int x;
			cin >> x;
			v.push_back(x);
		}
		vector <int> sum_list;
		for(int i = 0; i < v.size(); ++i) {
			for (int j = 0; j < v.size(); ++j) {
				if (v[i] !=  v[j]) {
					sum_list.push_back(v[i] + v[j]);
				}
			}
		}
		cout << "Case " << tc << ":" << endl;
		int q;
		cin >> q;
		while(q--) {
			int num;
			cin >> num;
			int ans = 0;
			int dif = 10e+6;
			for (int i = 0; i < sum_list.size(); ++i) {
				if (abs(sum_list[i]-num) < dif) {
					dif = abs(sum_list[i]-num);
					ans = sum_list[i];
				}
			}
			cout << "Closest sum to " << num << " is " << ans << "." << endl;
		}
	}
}
