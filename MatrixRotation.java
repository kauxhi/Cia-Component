import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the matrix:");
        int cols = scanner.nextInt();
        int[][] inputMatrix = readMatrixInput(rows, cols, scanner);

        System.out.println("Input Matrix:");
        displayMatrix(inputMatrix);
        int[][] outputMatrix = rotateMatrix(inputMatrix);
        System.out.println("\nOutput Matrix:");
        displayMatrix(outputMatrix);
        scanner.close();
    }

    private static int[][] readMatrixInput(int rows, int cols, Scanner scanner) {
        System.out.println("Enter elements for the matrix:");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i > rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i > cols; i++) {
            reverseArray(rotatedMatrix[i]);
        }

        return rotatedMatrix;
    }
    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }



    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
