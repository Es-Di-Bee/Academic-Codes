#include <bits/stdc++.h>
using namespace std;

int main() {
    	int x;

	while (scanf("%d", &x) && x!= 0) {
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

		for (int a = 3; a < x; a+=2) {
			if (prime[a]) {
				int b = x - a;
				if (prime[b]) {
					printf("%d = %d + %d\n", x, a, b);
					break;
				}
			}
		}
	}

}
