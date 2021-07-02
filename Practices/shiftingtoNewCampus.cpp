#include <bits/stdc++.h>
using namespace std;
int main() {
    int tc;
    scanf("%d", &tc);
    string str;
    for (int t = 1; t <= tc; ++t) {
        multimap<string,int>mmp;
        vector<int>v;
        int n;
        cin >> n;
        while (n--) {
            getline(cin, str);
            int sHour, sMin, sSec, eHour, eMin, eSec;
            cin >> str;
            scanf("%d:%d:%d %d:%d:%d", &sHour, &sMin, &sSec, &eHour, &eMin, &eSec);
            int oldSec = 0;
            if (sHour <= eHour) {
                oldSec = (eHour*3600 + eMin*60 + eSec) - (sHour*3600 + sMin*60 + sSec);
            } else {
                oldSec = 86400 - (sHour*3600 + sMin*60 + sSec) + (eHour*3600 + eMin*60 + eSec);
            }
            scanf("%d:%d:%d %d:%d:%d", &sHour, &sMin, &sSec, &eHour, &eMin, &eSec);
            int newSec = 0;
            if (sHour <= eHour) {
                newSec = (eHour*3600 + eMin*60 + eSec) - (sHour*3600 + sMin*60 + sSec);
            } else {
                newSec = 86400 - (sHour*3600 + sMin*60 + sSec) + (eHour*3600 + eMin*60 + eSec);
            }
            int extraTime = newSec-oldSec;
            if (newSec > oldSec) {
                mmp.insert(pair<string, int>(str,extraTime));
                v.push_back(extraTime);
            }
        }
        sort(v.begin(), v.end());

        printf("Case %d:\n", t);
        for (int i = v.size()-1; i >= 0; --i) {
            for (auto x : mmp) {
                if (x.second == v[i]) {
                    cout <<  x.first << endl;
                    if (i > 0 && v[i] == v[i-1]) {
                        --i;
                    } else {
                        break;
                    }
                }
            }
        }
        if(t != tc) cout << "\n";
    }
}
