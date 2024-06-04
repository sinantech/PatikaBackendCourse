import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Please Enter A Number : ");
        int number = data.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + "is a perfect number");
        } else {
            System.out.println(number + "is not a perfect number");
        }
    }
}
