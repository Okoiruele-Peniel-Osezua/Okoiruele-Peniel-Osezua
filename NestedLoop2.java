//Nested Loop
public class NestedLoop2 {
    public static void main(String[] args) {
        int rows = 9;
        int cols = 12;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i % 2 == 0) && (j < cols / 3 || j >= 2 * cols / 3)) {
                    System.out.print("*");
                } else if ((i % 2 != 0) && (j < cols / 3)) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
