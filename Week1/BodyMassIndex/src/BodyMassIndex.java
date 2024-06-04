import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        //variables
        double height,weight,massindex;
        //take data from the user
        Scanner data = new Scanner(System.in);
        System.out.println("Please Enter Your Height In Meters : ");
        height = data.nextDouble();
        System.out.println("Please Enter Your Weight In KG : ");
        weight = data.nextDouble();
        //math calculations
        massindex = weight / (height*height);
        System.out.println("Your Body Mass Index = " + massindex);
    }
}
