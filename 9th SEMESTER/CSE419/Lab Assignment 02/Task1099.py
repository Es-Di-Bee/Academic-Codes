for i in range(int(input())):
    inp = list(map(int, input().split()))
    x, y = inp[0], inp[1]
    if x > y: x, y = y, x
    sum = 0
    x += 1
    while x < y:
        if x % 2 == 1: sum += x
        x += 1
    print(sum)