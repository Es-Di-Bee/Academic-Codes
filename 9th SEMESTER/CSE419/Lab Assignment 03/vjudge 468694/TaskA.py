tc = int(input())

for t in range(tc):
    inp = [int(x) for x in input().split(' ')]
    inp = inp[1:]
    inp.sort()
    median = inp[len(inp) // 2]
    ans = sum([abs(x-median) for x in inp])
    print(ans)
