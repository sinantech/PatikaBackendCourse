import java.util.Scanner;

public class CircleAreaCalc {
    public static void main(String[] args) {
        //Variables
        double pi = 3.14;
        double radius,area,circle,slice;
        int angle;
        //Mathematics
        System.out.print("Please Enter The Radius Value : ");
        Scanner rad = new Scanner(System.in);
        radius = rad.nextDouble();
        area = (pi*radius*radius);
        System.out.print("Area Of Circle : " + area);
        circle = (2*pi*radius);
        System.out.print("Circle : " + circle);
        System.out.print("Please Enter The Slice Angle : ");
        Scanner ang = new Scanner(System.in);
        angle = ang.nextInt();
        slice = (pi*(radius*radius)*angle)/360;
        System.out.print("Slice Angle : " + slice);
    }
}
