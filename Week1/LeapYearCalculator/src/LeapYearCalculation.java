import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {
        int year;
        System.out.println("Please Enter The Year But Year Only : ");
        Scanner data = new Scanner(System.in);
        year = data.nextInt();

        if (year%4==0 && (year%100!=0)||(year%400==0)) {
            System.out.println("The Year You Entered Is Leap Year");
        } else {
            System.out.println("The Year You Entered Is Not Leap Year");
        }
    }
}
