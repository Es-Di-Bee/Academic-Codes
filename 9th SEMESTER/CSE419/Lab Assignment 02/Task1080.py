m, idx = 0, 0
for i in range(100):
    num = int(input())
    if num > m:
        m = num; idx = i + 1
print(m, idx, sep='\n')