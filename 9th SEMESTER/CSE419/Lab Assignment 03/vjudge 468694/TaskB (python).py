tc = 0

while True:
    tc += 1

    n = int(input())
    if n == 0: break

    ipt = []

    for i in range(n):
        ipt.append(int(input()))

    sum_list = []

    for i in ipt:
        for j in ipt:
            if i != j:
                sum_list.append(i + j)

    print(f'Case {tc}:')

    for i in range(int(input())):
        num = int(input())
        ans = min(sum_list, key=lambda x:abs(x-num))
        print(f'Closest sum to {num} is {ans}.')