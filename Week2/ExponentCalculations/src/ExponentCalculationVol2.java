import java.util.Scanner;

public class ExponentCalculationVol2 {
    // in this project we take the base and power from the user
    // I think this is not a recursive function because loop works
    public static void exp() {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the base: ");
            int base = inp.nextInt();
            System.out.print("Enter the exponent: ");
            int exponent = inp.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        exp();
    }
}
