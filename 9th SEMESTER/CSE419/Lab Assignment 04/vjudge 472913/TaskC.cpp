#include <bits/stdc++.h>
using namespace std;

int main() {
    	int x = 20000001;

	vector<int>v;
	bool prime[x+1];
	memset(prime, true, sizeof(prime));

	for (int i = 3; i <= sqrt(x); i+=2) {
		if (prime[i]) {
			for (int k = i*i; k <= x; k += (2*i)) {
				prime[k] = false;
			}
		}
	}

		memset(prime, false, 3);

	for (int a = 5; a < x; a+=2) {
		if (prime[a] && prime[a-2]) {
			v.push_back(a);
		}
	}

	int tc;
	while(cin >> tc) {
		cout << "(" << v[tc-1]-2 << ", " << v[tc-1] << ")\n";
	}

}
