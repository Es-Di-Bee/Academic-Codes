class Task01:
    def tracking_connections(self, graph_matrix):
        region = 0
        for i in range(len(graph_matrix)):
            for j in range(len(graph_matrix[i])):
                if (graph_matrix[i][j] == 1):
                    visited_node = []
                    region = max(self.dfs(i, j, len(graph_matrix), len(graph_matrix[0]), visited_node, graph_matrix), region)

        return region

    def dfs(self, i, j, row, col, visited_node, graph_matrix):
        visited_node.append((i, j))
        steps = [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1)]
        for x, y in steps:
            temp_loc = (i + x, j + y)
            if 0 <= temp_loc[0] < row and 0 <= temp_loc[1] < col:
                if temp_loc not in visited_node and graph_matrix[temp_loc[0]][temp_loc[1]]:
                    self.dfs(temp_loc[0], temp_loc[1], row, col, visited_node, graph_matrix)
        return len(visited_node)

    # ------------driver code-----------#

    def driver(self):
        input_text_files = ['input.txt', 'input 2.txt']

        for c, i in enumerate(input_text_files):
            print('\nTest Case', (c + 1))
            with open(i) as f:
                lines = f.readlines()

            graph_matrix = []
            for j in lines:
                row = []
                for label in j.split():
                    if label == 'Y':
                        row.append(1)
                    else:
                        row.append(0)

                graph_matrix.append(row)

            max_region = self.tracking_connections(graph_matrix)
            print("Maximum Region of Infection", max_region)


#------------------------------------------------------------------#


class Task02:
    def find_position(self, city):
        alien_positions, human_positions = [], []
        for i in range(len(city)):
            for j in range(len(city[i])):
                if city[i][j] == 'A':
                    alien_positions.append((i, j))
                elif city[i][j] == 'H':
                    human_positions.append((i, j))
        return alien_positions, human_positions

    def bfs(self, city, alien):
        steps = [(-1, 0), (0, -1), (0, 1), (1, 0)]
        time = -1
        visited, queue = [], []
        for i in alien:
            visited.append(i);
            queue.append(i)
        while queue:
            level_size = len(queue);
            while (level_size):
                s = queue.pop(0)
                # print(s)
                i = s[0];
                j = s[1]
                for x, y in steps:
                    temp_loc = (i + x, j + y)
                    if 0 <= temp_loc[0] < len(city) and 0 <= temp_loc[1] < len(city[0]):
                        if temp_loc not in visited and city[temp_loc[0]][temp_loc[1]] == 'H':
                            visited.append(temp_loc);
                            queue.append(temp_loc)
                level_size -= 1
            time += 1
        return time, len(visited) - len(alien)

    # ------------driver code-----------#

    def driver(self):
        input_text_files = ['Question2 input1.txt', 'Question2 input2.txt']

        for c, i in enumerate(input_text_files):
            print('\nTest Case', (c + 1))
            with open(i) as f:
                lines = f.readlines()[2:]

            city = []
            for j in lines:
                row = []
                for label in j.split():
                    row.append(label)
                city.append(row)

            # print(city)

            alien, human = self.find_position(city)
            print("Positions of Aliens:", alien)
            print("Positions of Humans:", human)

            time, attacked_number = self.bfs(city, alien)
            print("\nTime:", time, "minutes")
            remaining = len(human) - attacked_number
            print(remaining, "survived") if remaining > 0 else print("No one survived\n")


#------------------------------------------------------------------#

print("\nOutput of Question 01")

t1 = Task01()
t1.driver()

print('\n')

print("Output of Question 02")

t2 = Task02()
t2.driver()