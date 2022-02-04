# ------------ python code ------------- #
"""
input format:
---------------------------
no.of processes
no. of resources
max resource matrix
resource allocation matrix
resource available
---------------------------
"""

from copy import copy

def add_available_resources(i):  # this func. is for adding the allocated resource of the executed process
    global resource_allocation_matrix, resources_available, change_in_available_resource_matrix
    a = []
    [a.append(int(x)) for x in resource_allocation_matrix[i].split()]
    for j in range(len(resources_available)):
        resources_available[j] += a[j]
    change_in_available_resource_matrix.append(copy(resources_available))

# ----------- driver code ------------ #

with open('input3.txt') as f:  # reading all the lines of the input file
    lines = f.readlines()     # at once

processes = int(lines[0])
resources = int(lines[1])

max_resource_matrix = []                    # these are
resource_allocation_matrix = []             # the
resources_available = []                    # lists
need_matrix = []                            # we will
safe_sequence = []                          # be needing
change_in_available_resource_matrix = []    # for our
flag_for_need_matrix = [False] * processes  # task

[max_resource_matrix.append(lines[x].strip()) for x in range(2, 2+processes)]  # handling the input data

[resource_allocation_matrix.append(lines[x].strip()) for x in range(2+processes, 2+(2*processes))]  # handling the input data

for i in lines[-1].strip().split():  # handling the input data
    resources_available.append(int(i))

for i in range(processes):  # this for-loop is to form the need matrix
    a = [int(x) for x in max_resource_matrix[i].split()]
    b = [int(x) for x in resource_allocation_matrix[i].split()]
    need_matrix.append([a[j] - b[j] for j in range(resources)])

while True:  # this is the main loop for implementing Banker's algorithm
    flag = False  # this flag will remain False if no processes are executed in this round
    for i in range(processes):  # every time we have to check if there's any process left to execute
        if not flag_for_need_matrix[i]:  # if there is a process left to execute
            for j in range(resources):  # we are checking if available resources >= needed resources of that process
                if need_matrix[i][j] > resources_available[j]:  # even if 1 instance of a resource is insufficient,
                    break                                       # we break and move on the next process
                if j == resources-1:  # if all the instances meet the criteria
                    flag_for_need_matrix[i] = True  # we mark the process as executed
                    flag = True  # we understand that at least 1 process has been executed in this round
                    safe_sequence.append(chr(i+65))  # we add the process giving it a alphabetic name
                    add_available_resources(i)  # we add back the allocated resource of that process to the available resource

    if all(flag_for_need_matrix) or not flag:  # if all the processes are done executing or
        break                       # no processes were executed in this round, we break the loop

# ------- printing the results ------- #

if not flag:
    print("Safe sequence is :")
    [print(x, end=' ') for x in safe_sequence]
    print("\nNo more processes left whose resource needs can be met so there'll be a Deadlock")
    exit()

print("\nNeed Matrix :")
for i in need_matrix:
    [print(x, end=' ') for x in i]
    print()

print("\nSafe sequence is :")
[print(x, end=' ') for x in safe_sequence]

print('\n\nChange in available resource matrix :')
for i in change_in_available_resource_matrix:
    [print(x, end=' ') for x in i]
    print()
