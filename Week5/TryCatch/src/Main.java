import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int data;
        Scanner input = new Scanner(System.in);
        System.out.println("Array İndex");
        data = input.nextInt();
        array(array,data);
    }
    public static void array (int[] array,int data) {
        try {
            System.out.println(array[data]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}