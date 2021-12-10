package activity;

import java.util.Arrays;

public class SquareMatrix {

    //TODO: Update Class
    private int[][] matrix;
    private int size;

    /*Constructor accepts the size of the matrix
    and generates an identity matrix of that size.*/

    public SquareMatrix(int size) {
        this.size = size;
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (i == j)? 1:0;
            }
        }
    }

    /*Constructor accepts a 2D array that is assigned to the stored 2D array
    that represents the n x n matrix.*/

    public SquareMatrix(int[][] matrix) {
        int row, col;
        row = matrix.length;
        col = matrix[0].length;

        if (row != col)
            throw new IllegalArgumentException("It must be n x n matrix");

        this.matrix = matrix;
        this.size = row;
    }

    public SquareMatrix add(SquareMatrix other) {
        int[][] sum = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }
        return new SquareMatrix(sum);
    }

    public SquareMatrix subtract(SquareMatrix other) {
        int[][] subtract = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                subtract[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }
        return new SquareMatrix(subtract);
    }

    public SquareMatrix multiply(SquareMatrix other) {
        int[][] multiply = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int n = 0; n < size; n++) {
                    multiply[i][j] += matrix[i][n] * other.matrix[n][j];
                }
            }
        }
        return new SquareMatrix(multiply);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SquareMatrix) {
            SquareMatrix other = (SquareMatrix) obj;
            return Arrays.deepEquals(matrix, other.matrix);
        } else
            return false;
    }

    public boolean isDiagonal() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j && matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    public boolean isIdentity() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && matrix[i][j] != 1)
                    return false;
                else if (i != j && matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.append(matrix[i][j]).append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
