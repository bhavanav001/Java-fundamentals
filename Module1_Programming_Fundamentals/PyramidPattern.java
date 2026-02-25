package Module1_Programming_Fundamentals;
import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}