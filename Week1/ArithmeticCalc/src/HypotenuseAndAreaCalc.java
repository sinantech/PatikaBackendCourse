import java.util.Scanner;

public class HypotenuseAndAreaCalc {
    public static void main(String[] args) {
        //Enter scanner class
        Scanner data = new Scanner(System.in);
        //Variables
        double a,b;
        System.out.print("First Edge : ");
        a = data.nextFloat();
        System.out.print("Second Edge : ");
        b = data.nextFloat();
        // Need to use math class here
        double hypo = Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuse = " + hypo);
        // Using the hypo to calculate the area
        double u;
        double area;
        u = ((a+b+hypo)/2);
        area = Math.sqrt(u*(u-a)*(u-b)*(u-hypo));
        System.out.println("Area Of Triangle = " + area);
    }
}
