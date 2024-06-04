import java.util.Scanner;

public class MinAndMaxValues {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("How Many Numbers Do You Want To Add ?");
        int n = data.nextInt();
        int max = 0 , min = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Number : ");
            int number = data.nextInt();

            if (i == 0) {
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("Min : " + min + "\nMax : " + max);
    }
}
