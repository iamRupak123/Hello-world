matrix1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

matrix2 = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
]

rows = len(matrix1)
cols = len(matrix1[0])
result_matrix = [[0 for _ in range(cols)] for _ in range(rows)]


for i in range(rows):
    for j in range(cols):
        result_matrix[i][j] = matrix1[i][j] + matrix2[i][j]

print("Addition of two matrices (using nested loops):")
for row in result_matrix:
    print(row)
