i = 0.0
x, y, z = 1.0, 2.0, 3.0
while i <= 2:
    if i.is_integer():
        print(f'I={int(i)} J={int(x)}')
        print(f'I={int(i)} J={int(y)}')
        print(f'I={int(i)} J={int(z)}')
    else:
        i = round(i, 1)
        x = round(x, 1)
        y = round(y, 1)
        z = round(z, 1)
        print(f'I={i} J={x}')
        print(f'I={i} J={y}')
        print(f'I={i} J={z}')
    x += 0.2; y += 0.2; z += 0.2
    i += 0.2

