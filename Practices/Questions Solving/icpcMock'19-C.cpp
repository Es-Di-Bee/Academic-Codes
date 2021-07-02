#include<bits/stdc++.h>
using namespace std;
int main() {
    map<int, map<int, string>, greater<int> >mp;
    int n;
    scanf("%d", &n);
    while (n--) {
        int roll, marks;
        string name;
        scanf("%d", &roll);
        getline(cin, name);
        getline(cin, name);
        scanf("%d", &marks);
        mp[marks][roll] = name;
    }
    printf("Roll | Name       | Marks\n-------------------------\n");
    for (auto x : mp) {
        for (auto y : x.second) {
            printf("%4d | ", y.first);
            cout.width(10); cout << left << y.second;
            printf(" | %d\n", x.first);
        }
    }
}
