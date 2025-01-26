//Single Loop
public class Main {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 12;

        for (int i = 0; i < rows * cols; i++) {
            if ((i / cols) % 2 == 0) {
                if (i % cols < cols / 3 || i % cols >= 2 * cols / 3) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            } else {
                if (i % cols < cols / 3) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }

            if ((i + 1) % cols == 0) {
                System.out.println();
            }
        }
    }
}
