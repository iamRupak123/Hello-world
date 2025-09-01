def multiply_matrices_manual(matrix_a, matrix_b):
    rows_a = len(matrix_a)
    cols_a = len(matrix_a[0])
    rows_b = len(matrix_b)
    cols_b = len(matrix_b[0])

    if cols_a != rows_b:
        raise ValueError("Number of columns in Matrix A must be equal to the number of rows in Matrix B.")

    # Initialize the result matrix with zeros
    result_matrix = [[0 for _ in range(cols_b)] for _ in range(rows_a)]

    for i in range(rows_a):
        for j in range(cols_b):
            for k in range(cols_a):  # or rows_b, since they are equal
                result_matrix[i][j] += matrix_a[i][k] * matrix_b[k][j]
    return result_matrix

# Example usage:
matrix1 = [[1, 2], [3, 4]]
matrix2 = [[5, 6], [7, 8]]

result = multiply_matrices_manual(matrix1, matrix2)
print(result)
