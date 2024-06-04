import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //sum operator
        int friends = 4;
        friends += 1;
        System.out.println(friends);
        //sub operator
        int apples = 8;
        apples -= 2;
        System.out.println(apples);
        //multiplication operator
        int pencils = 14;
        pencils *= 2;
        System.out.println(pencils);
        //division operator
        int cigars = 20;
        cigars /= 2;
        System.out.println(cigars);
        //process priority we expect the result 16 down below
        // the order of operator division multiplication addition subtraction
        int priority = (10*2-6+4/2);
        System.out.println(priority);
        // residual operator
        int watermelons = 8;
        watermelons %= 3;
        System.out.println(watermelons);

        Scanner data = new Scanner(System.in);
        int a,b,c;
        int result;
        System.out.print("Please Enter First Number : ");
        a = data.nextInt();
        System.out.print("Please Enter Second number : ");
        b = data.nextInt();
        System.out.print("Please Enter Third Number : ");
        c = data.nextInt();
        result = (a+b*c-b);
        System.out.println("Result : " + result);
    }
}
