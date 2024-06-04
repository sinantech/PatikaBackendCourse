import java.util.Scanner;

public class GroceryCashApp {
    public static void main(String[] args) {
        //type conversions
        // with taxes
        //This program can write with double variable maybe I will change later
        float pear, apple, tomato, banana, onion;
        float p = (float) 45.70;
        float a = (float) 23.80;
        float t = (float) 37.95;
        float b = (float) 55.85;
        float o = (float) 17.15;
        double tax = 1.20;
        double payment;

        Scanner data = new Scanner(System.in);
        System.out.print("Please Enter The Pear Amount In KG : ");
        pear = data.nextFloat();
        System.out.print("Please Enter The The Apple Amount In KG : ");
        apple = data.nextFloat();
        System.out.print("Please Enter The Tomato Amount In KG : ");
        tomato = data.nextFloat();
        System.out.print("Please Enter The Banana Amount In KG : ");
        banana = data.nextFloat();
        System.out.print("Please Enter The Onion Amount In KG : ");
        onion = data.nextFloat();

        float Total = ((pear * p) + (apple * a) + (tomato * t) + (banana * b) + (onion + o));
        System.out.println("Total = " + Total);
        payment = (Total*tax);
        System.out.println("Total Payment = " + payment);

    }
}
