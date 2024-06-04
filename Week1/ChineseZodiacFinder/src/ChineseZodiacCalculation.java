import java.util.Scanner;

public class ChineseZodiacCalculation {
    public static void main(String[] args) {
        //Variables
        //Changed to if else construct
        System.out.println("Please Enter Your Birth Year But Year only : ");
        Scanner year = new Scanner(System.in);
        int birth;
        birth = year.nextInt();
        String zodiac = " ";

        if (birth % 12 == 0) {
            zodiac = "Monkey";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 1) {
            zodiac = "Cockerel";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 2) {
            zodiac = "Dog";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 3) {
            zodiac = "Pig";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 4) {
            zodiac = "Mouse";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 5) {
            zodiac = "Ox";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 6) {
            zodiac = "Tiger";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 7) {
            zodiac = "Rabbit";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 8) {
            zodiac = "Dragon";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 9) {
            zodiac = "Snake";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 10) {
            zodiac = "Horse";
            System.out.print("Chinese Zodiac : " + zodiac);
        } else if (birth % 12 == 11) {
            zodiac = "Sheep";
            System.out.print("Chinese Zodiac : " + zodiac);
        }

    }
}
