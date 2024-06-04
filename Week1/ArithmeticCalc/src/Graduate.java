import java.util.Scanner;

public class Graduate {
    public static void main(String[] args) {
        // All classes are our variables
        // Taking all notes from user
        System.out.println("**Welcome To Graduation Calculator System**");
        int math, chem, phys, bio, music, sports;
        int result, sum;
        Scanner notes = new Scanner(System.in);
        System.out.print("Please Enter Math Note : ");
        math = notes.nextInt();
        System.out.print("Please Enter Chemistry Note : ");
        chem = notes.nextInt();
        System.out.print("Please Enter Physics Note : ");
        phys = notes.nextInt();
        System.out.print("Please Enter Biology Note : ");
        bio = notes.nextInt();
        System.out.print("Please Enter Music Note : ");
        music = notes.nextInt();
        System.out.print("Please Enter Sports Note : ");
        sports = notes.nextInt();
        // Minus note entrance checked at first
        // I have designed letter notes and numeral notes at the same time no needed to average
        if (math < 0 || chem < 0 || phys < 0 || bio < 0 || music < 0 || sports < 0) {
            System.out.println("Please Check Your Notes !");
        } else {
            sum = (math + phys + chem + bio + music + sports);
            result = sum / 6;
            System.out.println("Your Average Note : " + result);
            if (result >= 90) {
                System.out.println("Passed With AA");
            } else if (result >= 80) {
                System.out.println("Passed With BA");
            } else if (result >= 75) {
                System.out.println("Passed With BB");
            } else if (result >= 70) {
                System.out.println("Passed With CB");
            } else if (result >= 65) {
                System.out.println("Passed With CC");
            } else if (result >= 60) {
                System.out.println("Passed With DC");
            } else if (result >= 55) {
                System.out.println("Passed With DD");
            } else {
                System.out.println("You Failed See You Next Year..!");
            }
        }
    }
}
