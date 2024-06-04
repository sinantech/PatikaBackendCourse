import java.util.Scanner;

public class PrimeNumberMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int number = input.nextInt();
        isAsal(number, 2);
    }
        // in this program method calls himself everytime until the following conditions are met
        // 2 is the start value of control and when method call himself base increasing everytime
        // like 2 3 4 5 6 until  to entered number
    static boolean isAsal(int number, int i) {


        if (i == number) {
            System.out.println(number + "  is a prime number.");
            return true;

        } else if (number % i == 0) {
            System.out.println(number + "  is not a prime number.");
            return false;

        }

        return isAsal(number, i + 1);

    }
}
