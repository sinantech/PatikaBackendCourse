import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z, t;
        Scanner data = new Scanner(System.in);
        System.out.print("Please Enter Digits : ");
        t = data.nextInt();
        System.out.print(x + "," + y);
        for (int i = 2; i <= t; i++) {
            z = x + y;
            System.out.print("," + z);
            x = y;
            y = z;
        }
    }
}
