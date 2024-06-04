import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        // Variables
        float price;
        float taxprice;
        float tax;
        // Scanner class
        Scanner pri = new Scanner(System.in);
        System.out.println("Please Enter The Price : ");
        // Take data from the user
        price = pri.nextFloat();
        //If user enters wrong data
        if (price <= 0) {
            System.out.println("Price Cannot Be Below Zero !");
        } else {
            taxprice = (float) (price*1.20);
            System.out.println("Price With Tax : " + taxprice);
            tax = (taxprice-price);
            System.out.println("Tax Value : " + tax);
        }
    }
}
