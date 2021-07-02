#include<bits/stdc++.h>
using namespace std;
int main() {
    vector<int>v(100000005,0); //change the vector size to the number you wish to generate primes upto
    v[0] = 1; v[1] = 1;
    for (int i = 4; i < v.size(); i+=2) {
        v[i] = 1;
    }
    for (int i = 3; i*i <= v.size(); i+=2) {
        if (v[i] == 0) {
            for (int j = i*i; j < v.size(); j += i*2) {
                v[j] = 1;
            }
        }
    }
    vector<int>primes;
    for (int i = 0; i < v.size(); ++i) {
        if (v[i] == 0) {
            primes.push_back(i);
        }
    }
    for (int i = 0; i < v.size(); ++i) {
        printf("%d, ", primes[i]);
    }
}
