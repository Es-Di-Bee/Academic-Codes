def isEmail(str):
    state = 0

    for char in str:
        if state == 0:
            if char.isalpha(): state = 1
            else: state = 6
        elif state == 1:
            if char.isalnum() or char == '.': state = 1
            elif ord(char) == 64: state = 2
            else: state = 6
        elif state == 2:
            if char.isalpha(): state = 3
            else: state = 6
        elif state == 3:
            if char.isalpha(): state = 3
            elif char == '.': state = 4
            else: state = 6
        elif state == 4:
            if char.isalpha(): state = 5
            else: state = 6
        elif state == 5:
            if char.isalpha(): state = 5
            else: state = 6
        elif state == 6:
            state = 6
        # print(char, "is in state:", state)

    if state == 5: return True
    elif state == 6: return False


def isWeb(str):
    state = 0

    for char in str:
        if state == 0:
            if char.isalpha(): state = 1
            else: state = 6
        elif state == 1:
            if char.isalpha(): state = 1
            elif char == '.': state = 2
            else: state = 6
        elif state == 2:
            if char.isalpha(): state = 3
            else: state = 6
        elif state == 3:
            if char.isalpha(): state = 3
            elif char == '.': state = 4
            else: state = 6
        elif state == 4:
            if char.isalpha(): state = 5
            else: state = 6
        elif state == 5:
            if char.isalpha(): state = 5
            else: state = 6
        elif state == 6:
            state = 6
        # print(char, "is in state:", state)

    if state == 5: return True
    elif state == 6: return False

########### driver code ###########

n = int(input())

for i in range(n):
    str = input()
    if isEmail(str): print("Email,", i+1)
    elif isWeb(str): print("Web,", i+1)
    else: print("Neither Email nor Web,", i+1)