public class Main {

    public static void main(String[] args) {
        try {

            double[][] A = {
                    {1.0, 2.0, 3.0},
                    {4.0, 5.0, 6.9},
                    {7.0, 8.0, 9.0}
            };

            double[][] B = {
                    {9.0, 8.0, 7.0},
                    {6.0, 5.0, 4.0},
                    {3.0, 2.0, 1.0}
            };


            double[][] C = multiplyMatrices(A, B);


            System.out.println("Matrix C (A * B):");
            printMatrix(C);


            double sumOfMaxElements = sumMaxElementsInRows(C);
            System.out.println("Sum of the largest elements in each row of matrix C: " + sumOfMaxElements);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static double[][] multiplyMatrices(double[][] A, double[][] B) throws IllegalArgumentException {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }

        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    private static double sumMaxElementsInRows(double[][] matrix) {
        double sum = 0;

        for (double[] row : matrix) {
            double max = row[0];
            for (double element : row) {
                if (element > max) {
                    max = element;
                }
            }
            sum += max;
        }
        return sum;
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%.2f ", element);
            }
            System.out.println();
        }
    }
}
