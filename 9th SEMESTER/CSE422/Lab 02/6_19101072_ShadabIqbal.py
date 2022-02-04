import numpy as np

def fitness(population, n):
    fitness_score = []

    for chromosome in population:
        fit = 0
        for i in range(len(chromosome)):
            if chromosome[i] == 1:
                action = data[i].split()[0]
                amount = int(data[i].split()[1])
                if action == 'd':
                    fit += amount
                else:
                    fit -= amount
        fitness_score.append(abs(0 - fit))

    return fitness_score


def select(population, fit):
    sample_size = 2
    multi_selection = False  # because we have to do cross mutation between different chromosomes
    probability = [x / np.sum(fit) for x in fit]
    index1, index2 = np.random.choice(len(population), sample_size, multi_selection, probability)
    return population[index1], population[index2]


def crossover(x, y):
    crossover_point = np.random.randint(0, len(x))
    crossover_child = np.concatenate((x[:crossover_point], y[crossover_point:]))
    return crossover_child


def mutate(child):
    index_to_mutate = np.random.randint(0, len(child))
    child[index_to_mutate] = 1 if child[index_to_mutate] == 0 else 0
    return child


def genetic_algo(population, n, mutation_threshold):
    max_iterations = 1000
    goal_fit = 0

    for iteration in range(1, max_iterations):
        new_population = []
        fitness_score = fitness(population, n)
        for i in range(len(population)):
            parent1, parent2 = select(population, fitness_score)
            child = crossover(parent1, parent2)
            if np.random.random() < mutation_threshold:
                child = mutate(child)
            if all(x == 0 for x in child):
                new_population.append(child)
                continue
            if fitness([child], n)[0] == goal_fit:
                print(child, "found after", iteration, 'iterations')
                return None
            new_population.append(child)
        population = new_population

    return -1


# ------------ driver code -----------#

transactions = int(input())
data = []

for i in range(transactions):
    data.append(input())


start_population = 10
mutation_threshold = 0.3
population = np.random.randint(0, 2, (start_population, transactions))

'''calling the GA function'''
ans = genetic_algo(population, transactions, mutation_threshold)

if ans is not None: print(-1)