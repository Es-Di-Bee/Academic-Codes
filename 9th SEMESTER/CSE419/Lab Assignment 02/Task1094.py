total, c, r, s = 0, 0, 0, 0
for i in range(int(input())):
    inp = list(input().split())
    number = int(inp[0])
    animal = inp[1]
    if animal == 'C': c += number
    elif animal == 'R': r += number
    else: s += number
    total += number

print(f'Total: {total} cobaias')
print(f'Total de coelhos: {c}')
print(f'Total de ratos: {r}')
print(f'Total de sapos: {s}')
print('Percentual de coelhos:', '{:.2f}'.format(round(c/total * 100, 2)), '%')
print('Percentual de ratos:', '{:.2f}'.format(round(r/total * 100, 2)), '%')
print('Percentual de sapos:', '{:.2f}'.format(round(s/total * 100, 2)), '%')


