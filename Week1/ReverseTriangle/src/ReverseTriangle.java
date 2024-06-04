import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = input.nextInt();

        for (int i = n - 1; i >= 1; i--) {

            for (int t = 1; t <= n - i; t++) {
                System.out.print(" ");

            }

            for (int g = 1; g <= (2 * i - 1); g++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}