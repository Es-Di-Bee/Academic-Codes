#include <bits/stdc++.h>
using namespace std;

int n, c, include;
vector<int> v;

void printing(int a, int b) {
	cout << n << " " << c << ": ";
	for (int i = a; i <= b; ++i) {
		cout << v[i];
		if (i != b) cout << " ";
	}
	cout << endl << endl;
}

bool checkPrime(int a) {
	for (int i = 2; i < a; ++i) {
		if (a % i == 0) return false;
	}
	return true;
}

int main() {
	while (cin >> n >> c) {

		v.clear();

		for (int i = 1; i <= n; ++i) {
			if (checkPrime(i)) v.push_back(i);
		}

		if (v.size() % 2 == 0) include = c * 2;
		else include = (c * 2) - 1;

		if (include >= v.size()) printing(0, v.size()-1);
		else {
			int x = (v.size() - include) / 2;
			printing(x, v.size()-1-x);
		}

	}
}
