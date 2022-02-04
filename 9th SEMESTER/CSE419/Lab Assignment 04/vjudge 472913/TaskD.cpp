#include <bits/stdc++.h>
using namespace std;

int main() {
	long long int x;

	while (cin >> x) {
		if (x == 0) break;

		vector<long long> v;

		for (int i = 1; i <= sqrt(x); ++i) {
			if (x % i == 0) {
				v.push_back(i);
				if (i != (x/i))  v.push_back(x / i);
			}
		}

		int count = 1;

		for (int i = 0; i < v.size(); ++i) {
			for (int j = i +1; j < v.size(); ++j) {
				long long gcd = __gcd(v[i], v[j]);
				long long prod = v[i] * v[j];
				if (prod / gcd == x) ++count;
			}
		}

		cout << x << " " << count << endl;
	}
}
