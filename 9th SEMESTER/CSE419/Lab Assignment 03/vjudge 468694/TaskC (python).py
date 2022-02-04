def binary_search(arr, low, high, num):
    if high >= low:
        mid = (high + low) // 2
        if arr[mid] == num:
            return mid
        elif arr[mid] < num:
            return binary_search(arr, mid+1, high, num)
        elif arr[mid] > num:
            return binary_search(arr, low, mid-1, num)
    else:
        return -1


count = 0

while True:
    count += 1
    inp = [int(x) for x in input().split(' ')]
    if inp == [0, 0]: break;

    marbles = [ int(input()) for x in range(inp[0])]
    marbles.sort()

    print(f"CASE# {count}:")

    for i in range(inp[1]):
        q = int(input())
        ans = binary_search(marbles, 0, len(marbles)-1, q)

        while ans > 0 and marbles[ans-1] == marbles[ans]:
            ans -= 1

        if ans != -1:
            print(f"{q} found at {ans+1}")
        else:
            print(f"{q} not found")
