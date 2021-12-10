package activity;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainProgram {

    public static SquareMatrix read(String location) throws IOException {
        File file      = new File(location);
        Scanner input  = new Scanner(file);
        int size       = input.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        return new SquareMatrix(matrix);
    }

    public static void write(String location, StringBuilder builder) throws IOException {
        File file           = new File(location);
        PrintWriter writer  = new PrintWriter(file);

        writer.println(builder);
        writer.close();
    }

    public static void main(String[] args) throws IOException{
        String location       = "data" + File.separator + "matrix.txt";
        String otherLocation  = "data" + File.separator + "other_matrix.txt";
        String outputLocation = "data" + File.separator + "output.txt";

        // Create object to append string output of matrix
        StringBuilder builder = new StringBuilder("\n");

        // TODO : Create matrices for testing
        SquareMatrix m1 = read(location);
        SquareMatrix m2 = read(otherLocation);

        // TODO : Test operations of Square Matrices
        builder.append("PROGRAM TEST\n");
        builder.append("\nMatrix:" + m1.toString());
        builder.append("\nOther Matrix:" + m2.toString());
        builder.append("\nMatrix + Other Matrix:" + m1.add(m2));
        builder.append("\nMatrix - Other Matrix:" + m1.subtract(m2));
        builder.append("\nMatrix * Other matrix:" + m1.multiply(m2));
        builder.append("\nCheck if Matrix is diagonal: " + m1.isDiagonal() + "\n");
        builder.append("\nCheck if Matrix is identity: " + m1.isIdentity() + "\n");
        builder.append("\nCheck if Other Matrix is diagonal: " + m2.isDiagonal() + "\n");
        builder.append("\nCheck if Other Matrix is identity: " + m2.isIdentity() + "\n");
        builder.append("\nCheck if two matrices are equal: " + m1.equals(m2));

        // write to output file
        write(outputLocation, builder);

    }
}
