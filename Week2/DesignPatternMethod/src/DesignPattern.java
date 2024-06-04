import java.util.Scanner;

public class DesignPattern {
    static int pattern(int n) {
        // this condition if you enter a number below zero adds 5 and ends the program
        System.out.print(" " + n);

        if (n <= 0) {
            return n + 5;
        }

        return pattern(n - 5);

    }
        // and this condition adds blank and returns everytime and add 5
        // we added k to pattern 1 for design and returns both of methods
        // in pattern 2 we are using k variable and number from the user
    static int pattern2(int x, int number1) {
        System.out.print(" " + x);
        if (x >= number1) {
            return x;
        }


        return pattern2(x + 5, number1);
    }

    public static void main(String[] args) {
        int number;
        int k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = scan.nextInt();
        k = pattern(number);
        pattern2(k, number);

    }
}
