import java.util.Scanner;

public class Game {
    private Scanner select = new Scanner(System.in);

    // This method starts the game in main class
    public void start() {
        System.out.println("Welcome to Adventure Game ! ");
        System.out.print("Please Enter Your GameCharacter Name : ");
        // Take username from the user
        String playerName = select.nextLine();
        //Creating new player object from the player class
        Player playerOne = new Player(playerName);
        System.out.println(playerOne.getPlayerName() + " Welcome to Battle ! ");
        System.out.println("This dark world will bring you another dimension..!");
        System.out.println("Please Select Your GameCharacter ! ");

        //Calling select character method from player class for the player one object
        playerOne.selectChar();

        Location newLocation = null;
        while (true) {
            playerOne.printPlayerInfo();
            System.out.println();
            System.out.println("-------------------Locations-------------------");
            System.out.println("1-Safe House");
            System.out.println("2-Store");
            System.out.println("3-Cave");
            System.out.println("4-Forest");
            System.out.println("5-Ruins");
            System.out.println("0-Exit Game");
            System.out.print("Please select Location You Want To go :  ");
            int selectLocation = select.nextInt();
            switch (selectLocation) {
                case 0:
                    newLocation = null;
                    break;
                case 1:
                    newLocation = new SafeHouse(playerOne);
                    break;
                case 2:
                    newLocation = new ToolStore(playerOne);
                    break;
                case 3:
                    newLocation = new Cave(playerOne);
                    break;
                case 4:
                    newLocation = new Forest(playerOne);
                    break;
                case 5:
                    newLocation = new Ruins(playerOne);
                    break;
                default:
                    System.out.println("Check Your Choice..!");;
            }
            if (newLocation == null) {
                System.out.println("Game Has Ended ! ");
                break;
            }
            if (!newLocation.onLocation()) {
                System.out.println("Game Over !");
                break;
            }
        }
    }
}
