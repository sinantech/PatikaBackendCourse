import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //With string class the code will be shorter I think
        Scanner data = new Scanner(System.in);
        System.out.println("=================================");
        String operations = "1-Addition\n"
                + "2-Extraction\n"
                + "3-Multiply\n"
                + "4-Divide\n";
        System.out.print(operations);
        System.out.println("==================================");
        System.out.print("Choose Your Process : ");
        String op = data.nextLine();
        int n1, n2;
        // As always switch case condition much easier to me
        switch (op) {
            case "1":
                System.out.print("First Number : ");
                n1 = data.nextInt();
                System.out.print("Second Number : ");
                n2 = data.nextInt();
                System.out.println("Result = " + (n1 + n2));
                break;
            case "2":
                System.out.print("First Number : ");
                n1 = data.nextInt();
                System.out.print("Second Number : ");
                n2 = data.nextInt();
                System.out.println("Result = " + (n1 - n2));
                break;
            case "3":
                System.out.print("First Number : ");
                n1 = data.nextInt();
                System.out.print("Second Number : ");
                n2 = data.nextInt();
                System.out.println("Result = " + (n1 * n2));
                break;
            case "4":
                System.out.print("First Number : ");
                n1 = data.nextInt();
                System.out.print("Second Number : ");
                n2 = data.nextInt();
                if (n2 == 0) {
                    System.out.println("Numbers Cannot Divide To Zero ! ");
                } else {
                    System.out.println("Result = " + (double) n1/n2);
                }
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
