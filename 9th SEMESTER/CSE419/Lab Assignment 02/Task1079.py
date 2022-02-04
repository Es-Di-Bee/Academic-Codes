for i in range(int(input())):
    inp = list(map(float, input().split()))
    ans = (inp[0]*2 + inp[1]*3 + inp[2]*5) / 10
    print(round(ans, 1))