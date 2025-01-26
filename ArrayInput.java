import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Declare an array of length 10

        Scanner scanner = new Scanner(System.in);

        // Accept input from user and assign to array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the input using for-each loop
        System.out.println("Entered numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
