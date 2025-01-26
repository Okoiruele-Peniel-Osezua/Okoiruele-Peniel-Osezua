import java.util.Scanner;
public class TwoDimensionalArrayInput {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10]; // Declare a 2D array of size 10 by 10

        Scanner scanner = new Scanner(System.in);

        // Accept input from user and assign to array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter number for index [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the input using for-each loop
        System.out.println("Entered numbers:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
